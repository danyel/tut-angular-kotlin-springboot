import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HelloWorldService } from './hello-world.service';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { HelloComponent } from './hello/hello.component';
import { PeaceComponent } from './peace/peace.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    PeaceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [HelloWorldService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
