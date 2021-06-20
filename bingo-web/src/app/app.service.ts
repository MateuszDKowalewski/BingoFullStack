import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {FieldDto} from './field-dto-model';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  randomBoardURL = '/field/random';

  constructor(private http: HttpClient) { }

  getRandomBoard(): Observable<FieldDto[]> {
    return this.http.get<FieldDto[]>(this.randomBoardURL + '/25')
  }
}
