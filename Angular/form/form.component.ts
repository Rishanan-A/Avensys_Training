import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {
  firstname='';

  formTest1(formValue:NgForm){
    console.log(formValue.value)
  }

  checkBoxValue = false;

  selectedOption = '';
  description ='';

  isFormComplete = true;

  resetForm(value:NgForm){
      value.reset()
  }

  setValues(value:NgForm){
    let details={
      firstname:"Tess",
      checkBoxValue: true,
      selectedOption: 'Option 2',
    description :'Testing'
    }
    value.setValue(details)
  }
}
