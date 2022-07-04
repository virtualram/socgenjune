import { Component } from '@angular/core';
import { SubComponent } from './sub/sub.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'component';
  title2 = 'Welcome to angular training'
 flag:boolean = false;

 method1(){
     this.flag = (this.flag === false?true:false);
 }
}
