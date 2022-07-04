import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';//import the formgroup 


@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component implements OnInit {
  profileForm = new FormGroup({  //instantiate new form group
    firstName: new FormControl('',[Validators.required,Validators.minLength(4)]), //within from group instantiate new form control
    lastName: new FormControl(''),
  });
  constructor() { 
  }
  onSubmit() 
  { // TODO: Use EventEmitter with form value 
  console.log(this.profileForm.value);
   }
  
  ngOnInit() {
  }

}
