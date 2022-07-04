import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {

  constructor() { }


  showTodayDate() {
        let ndate = new Date();
        return ndate;
     }
    
}
