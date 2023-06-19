import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Cop1Component } from '../cop1/cop1.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { Cop2Component } from '../cop2/cop2.component';
import { Pg404Component } from '../pg404/pg404.component';
import { ProductComponent } from '../product/product.component';
import { FormComponent } from '../form/form.component';
//
import { ReactiveFormsModule } from '@angular/forms';
import { Form2Component } from '../form2/form2.component';

@NgModule({
  declarations: [
    AppComponent,
    Cop1Component,
    Cop2Component,
    Pg404Component,
    ProductComponent,
    FormComponent,
    Form2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
