import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Project1';

  contacts=[
    {
    'fName': 'rishanan',
    'lName' : 'asogan',
    'ID' : '1234'
    },
    {
      'fName': 'rishanan2',
      'lName' : 'asogan2',
      'ID' : '12'
    },
    {
      'fName': 'rishanan2',
      'lName' : 'asogan2',
      'ID' : '34'
    }
  
  ]
}


