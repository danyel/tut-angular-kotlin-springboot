import { Component, OnInit } from '@angular/core';
import { HelloWorldService } from './hello-world.service';
import { HelloWorld } from './hello-world.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'angular';
  hello: string = "";

  constructor(private helloWorldService: HelloWorldService) {
  }

  ngOnInit(): void {
    this.helloWorldService.hello()
      .subscribe((helloWorld: HelloWorld) => this.hello = helloWorld.hello);
  }
}
