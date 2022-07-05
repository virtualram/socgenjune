import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';//import the formgroup 

import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component implements OnInit {
  profileForm = new FormGroup({  //instantiate new form group
    username: new FormControl('',[Validators.required,Validators.minLength(4)]), //within from group instantiate new form control
    email: new FormControl('',[Validators.email])
  });
  /*
  postData = {
    username: 'naren1angular',
    email: 'abcddd@yahoo.com'
  };*/

  postData = {
    username: this.profileForm.get('username').value,
    email: this.profileForm.get('email').value
  };

  url;
  json;
  constructor(private http: HttpClient ) { 
  }
  onSubmit() 
  { // TODO: Use EventEmitter with form value 
  console.log(this.profileForm.value);
  this.postData.username = this.profileForm.get('username').value;
  this.postData.email = this.profileForm.get('email').value;
  console.log(this.postData);
  
  this.url = 'http://localhost:8080/hello';

  this.http.get('http://localhost:8080/hello').toPromise()
  .then((data:any) => {
    console.log('Return'+ data.json);
  
    this.json = data.json;
   });


   ///posting data
   this.http.post('http://localhost:8080/createuser',this.postData).toPromise()
   .then((data:any) => {
     console.log('Return'+ data.json);
   
     this.json = data.json;
    });
   }
  

  ngOnInit() {
  }

}
