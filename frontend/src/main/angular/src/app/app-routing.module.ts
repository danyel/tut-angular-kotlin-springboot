import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HelloComponent } from './hello/hello.component';
import { PeaceComponent } from './peace/peace.component';


const routes: Routes = [{
  path: 'hello',
  component: HelloComponent
}, {
  path: 'peace',
  component: PeaceComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
