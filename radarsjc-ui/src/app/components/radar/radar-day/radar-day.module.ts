import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { RadarDayInfoComponent } from './radar-day-info/radar-day-info.component';
import { RadarDaySearchComponent } from './radar-day-search/radar-day-search.component';
import { RadarDayComponent } from './radar-day.component';

@NgModule({
  declarations: [
    RadarDayComponent,
    RadarDayInfoComponent,
    RadarDaySearchComponent
  ],
  exports: [
    RadarDayComponent,
    RadarDayInfoComponent,
    RadarDaySearchComponent
  ],
  imports: [
    CommonModule,
    SharedModule,
    HttpClientModule
  ]
})
export class RadarDayModule { }
