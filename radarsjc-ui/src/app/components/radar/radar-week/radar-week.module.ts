import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { RadarWeekComponent } from './radar-week.component';

@NgModule({
  declarations: [
    RadarWeekComponent
  ],
  exports: [
    RadarWeekComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    SharedModule
  ]
})
export class RadarWeekModule { }
