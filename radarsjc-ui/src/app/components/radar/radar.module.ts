import { NgModule } from '@angular/core';
import { RadarDayModule } from './radar-day/radar-day.module';
import { RadarWeekModule } from './radar-week/radar-week.module';

@NgModule({
  imports: [
    RadarDayModule,
    RadarWeekModule
  ]
})
export class RadarModule { }
