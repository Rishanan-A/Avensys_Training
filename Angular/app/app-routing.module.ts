import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Cop1Component } from 'src/cop1/cop1.component';
import { Cop2Component } from 'src/cop2/cop2.component';
import { Pg404Component } from 'src/pg404/pg404.component';
import { guard1Guard } from './guard1.guard';
import { guard2Guard } from './guard2.guard';
import { ProductComponent } from '../product/product.component';
import { FormComponent } from '../form/form.component';
import { Form2Component } from 'src/form2/form2.component';

const routes: Routes = [

  { path: 'cop1',component:Cop1Component, canActivate:[guard1Guard]},
  { path: 'cop2',component:Cop2Component},
  { path: 'payment', loadChildren: () => import('../payment/payment.module').then(m => m.PaymentModule) },
  //{ path: '**',component:Pg404Component},
  { path: "form", component:FormComponent},
  { path: "form2", component:Form2Component}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
