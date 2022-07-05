import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SubComponent } from './sub/sub.component';
import { NgModel } from '@angular/forms';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { Form1Component } from './form1/form1.component';
import { HttpClient, HttpClientModule   } from '@angular/common/http';
import { MenuComponent } from './menu/menu.component';
import { Routes, RouterModule ,ActivatedRoute } from '@angular/router';
let  routes: Routes = [
 {path: 'Form', component:Form1Component},
 {path: 'Sub', component:SubComponent},
{path:'App',component:AppComponent}

];
@NgModule({
  declarations: [
    AppComponent,
    SubComponent,
    Form1Component,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,
    HttpClientModule  ,FormsModule,ReactiveFormsModule,RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [MenuComponent]
})
export class AppModule { }
