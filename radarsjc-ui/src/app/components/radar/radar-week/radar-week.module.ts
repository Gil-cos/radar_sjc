import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { RadarWeekComponent } from './radar-week.component';
import { RadarDetailsComponent } from './radar-details/radar-details.component';

@NgModule({
  declarations: [
    RadarWeekComponent,
    RadarDetailsComponent
  ],
  exports: [
    RadarWeekComponent,
    RadarDetailsComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    SharedModule
  ]
})
export class RadarWeekModule { }
