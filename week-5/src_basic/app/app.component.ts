import { Component, ViewChild } from '@angular/core';
import { DemoComponentComponent } from './demo-component/demo-component.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Practice';
  hari:boolean=true;
  col:string='blue';
  mysty:object={
    color:'pink',
    background:'blue'
  }
   count:number=0
   incresase(){
    this.count+=1;
  }
  na:string='xyz';
  name(e:any){
    this.na=e.target.value
    console.log(e);
    console.log(e.target);
    console.log(e.target.value);
  }
  city:string="ongole";
  updateCity(){
    this.city='Nellore';
  }
  fruits:String[]=['apple','mango','banana']
  num1:number=5
  num2:number=10
  op:string=''

  obj={'name':'karthik','age':21}
  d=new Date();
  per=0.9;
  slic='karthik'
  // username:string=''
  abc(a:any){
    console.log(a.form.value);
  }
//   communication
// parent:String='Parent Info';

// childDateToParent:any;
// @ViewChild(DemoComponentComponent) childdemo:any;
// das='';

// test(){
//    this.das= this.childdemo.Inchild();
  
// }

}
