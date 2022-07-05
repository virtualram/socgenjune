import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SubComponent } from './sub/sub.component';
import { NgModel } from '@angular/forms';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { Form1Component } from './form1/form1.component';
import { HttpClient, HttpClientModule   } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    SubComponent,
    Form1Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,
    HttpClientModule  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
