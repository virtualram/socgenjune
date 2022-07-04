import { Component, OnInit,EventEmitter } from '@angular/core';
import { Service1Service } from '../service1.service';

@Component({
  selector: 'app-sub',
  templateUrl: './sub.component.html',
  styleUrls: ['./sub.component.css']
})
export class SubComponent implements OnInit {
  size: number =9; 
  showValue =  new EventEmitter();

  constructor(private svc:Service1Service ) {

    // This @Input makes this size property accept values  dec() { this.resize(-1); }
 
   }
    inc() { this.resize(+1);
  
     console.log(this.svc.showTodayDate());
  
   }
   
    resize(delta: number) {
        this.size = Math.min(40, Math.max(8, +this.size + delta));
        this.showValue.emit(this.size);
        console.log(this.size);

   }
  ngOnInit() {
  }

}
