import { Component, OnInit } from '@angular/core';
import { FormArray } from '@angular/forms';
import { FormBuilder, Validators } from '@angular/forms';
import { FormControl } from '@angular/forms';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.css']
})
export class Form2Component implements OnInit{

  

  addForm: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
  //     this.addForm = new FormGroup({
  //     'textField': new FormControl(),
  //     'description': new FormControl(),
  //     'checkBoxValue': new FormControl(),
  //     'dropDown': new FormControl()
  //   });


    let users = new FormArray([
        new FormControl('first one'),
        new FormControl('second one')
    ])

    console.log(users)
    console.log(users.valid)

    this.addForm = this.fb.group({
      textField: ['', Validators.compose([Validators.minLength(5), Validators.required])],
      description: ['', Validators.compose([Validators.minLength(10),Validators.maxLength(20),
                                             Validators.required])],
      checkBoxValue: [false],
      dropDown: ['Option 1'],

    //   'users':new FormArray([
    //     new FormControl('first one'),
    //     new FormControl('second one')
    // ])

    'users':new FormArray([
      this.fb.group({
        'name': new FormControl(''),
        'Marks': new FormControl(''),
        'Branch': new FormControl('')
      })
  ])
    });
    
    // console.log(this.addForm.pristine)
    // console.log(this.addForm.valid)
    // console.log(this.addForm.invalid)
    // console.log(this.addForm.dirty)
    // console.log(this.addForm.touched)
    // console.log(this.addForm.untouched)
    
    
  }



  adval(){
    console.log(this.addForm.value)
    console.log("Name: "+this.addForm.get('textField').value);

    // console.log(this.addForm.pristine)
    // console.log(this.addForm.valid)
    // console.log(this.addForm.invalid)
    // console.log(this.addForm.dirty)
    // console.log(this.addForm.touched)
    // console.log(this.addForm.untouched)
  }

  get users():FormArray{
    return this.addForm.get('users') as FormArray
  }

  assign(i) {
    let arr = this.addForm.get('users') as FormArray;
    let values = arr.value;
    
    if (values[i].Marks > 60) {
      values[i].Branch = 'CSE';
    } else {
      values[i].Branch = 'Not Eligible';
    }
    this.users.setValue(values);
  }
  


  addFormElements(){
    let userArr= this.addForm.get('users') as FormArray;
    let newUser = this.fb.group({
     'name':'',
     'Marks':'',
     'Branch':''
    })
    userArr.push(newUser)
    
  }
  removeFormElements(i){
    let arr = this.addForm.get('users') as FormArray
    arr.removeAt(i)
  }
  
  resetForm(){
    this.addForm.reset();
  }
}
