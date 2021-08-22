import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Person } from './person';


@Injectable({
  providedIn: 'root'
})
export class ServicesService {

  private Url="http://localhost:8080/api_test_tech/person";

  constructor(private httpClient: HttpClient) { }


  Addperson(person: Person): Observable<Object>{
    return this.httpClient.post(`${this.Url}`, person);
  }
  
  getPerson(): Observable<Person[]>{
    return this.httpClient.get<Person[]>(`${this.Url}`);
  }

  getPersonList(): Observable<Person[]>{
    return this.httpClient.get<Person[]>(`${this.Url}`);
  }

  getPersonById(id: number): Observable<Person>{
    return this.httpClient.get<Person>(`${this.Url}/${id}`);
  }



}
