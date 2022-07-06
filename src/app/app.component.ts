import { Component ,Input} from '@angular/core';
import { SubComponent } from './sub/sub.component';
import { Customer } from './Customer';
import { NgModel } from '@angular/forms';

//Developer 1 has made the change 1


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  @Input() title:String = 'component';
  title2 = 'Welcome to angular training'
 flag:boolean = false;
 currentCustomer:Customer;
 items:any
 constructor(){
  this.currentCustomer = new Customer();
  this.currentCustomer.firstname ='NAren';
  this.items = {name:'laptop',price:10000};

 }

 method1(x:String){
     this.flag = (this.flag === false?true:false);
     console.log(x)
      console.log(this.items);
 }
 
}
