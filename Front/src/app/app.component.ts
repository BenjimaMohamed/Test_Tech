import { Component, OnInit } from '@angular/core';
import { Person } from './person';
import { ServicesService } from './services.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  person: Person = new Person();
  persons: Person[] | undefined;


  constructor(private services: ServicesService ,  private router: Router) { }

  ngOnInit(): void {
    this.getPerson();
  }
  
  savePerson(){
    this.services.Addperson(this.person).subscribe( (data: any) =>{
      console.log(data);
    },
      (    error: any) => console.log(error));
  }

  private getPerson(){
    this.services.getPersonList().subscribe(data => {
      this.persons = data;
    });
  }
  PersonDetails(id: number){
    this.router.navigate(['Person-details', id]);
  }
}
