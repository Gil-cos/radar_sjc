import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { RadarWeekComponent } from './components/radar/radar-week/radar-week.component';
import { RadarDayComponent } from './components/radar/radar-day/radar-day.component';
import { RadarListResolver } from './service/radar/radar-list.resolver';

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'week',
    component: RadarWeekComponent,
    resolve: { radarList: RadarListResolver }
  },
  {
    path: 'day',
    component: RadarDayComponent
  },
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
