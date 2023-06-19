import { Component } from '@angular/core';

@Component({
  selector: 'app-cop1',
  templateUrl: './cop1.component.html',
  styleUrls: ['./cop1.component.css']
})
export class Cop1Component {

  r="red"
  g='lightgreen'
  superpower="Flash"

  sentence="This is a sentence"
  
  i=0
  class = 'c1 c3'
  class1 = 'c2 c4'
  getClass(): string {
    return this.i === 0 ? this.class : this.class1;
  }

  h="Head"

  val=1.5

  hello() {
    console.log('Hello!'); 
  }

  a(x: any, y: any, z: any): void {
    console.log(x + y + z);
  }

  lower_Case="THIS USED TO BE IN UPPER CASE."

  upper_Case="this used to be in lower case"

  date_ex=Date.now()

  obj={
    "val1":"ships",
    "val2":"trains",
    "val3":"cars"
  }

  cur=100

  val1=23
}

