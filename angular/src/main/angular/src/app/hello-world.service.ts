import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HelloWorld } from './hello-world.model';
import { Injectable } from '@angular/core';

@Injectable()
export class HelloWorldService {

  constructor(private httpClient: HttpClient) {
  }

  hello(): Observable<HelloWorld> {
    return this.httpClient.get<HelloWorld>("hello");
  }
}
