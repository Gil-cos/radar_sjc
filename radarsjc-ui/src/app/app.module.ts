import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeModule } from './components/home/home.module';
import { RadarDayInfoComponent } from './components/radar/radar-day/radar-day-info/radar-day-info.component';
import { RadarDaySearchComponent } from './components/radar/radar-day/radar-day-search/radar-day-search.component';
import { RadarDayComponent } from './components/radar/radar-day/radar-day.component';
import { RadarWeekComponent } from './components/radar/radar-week/radar-week.component';
import { CoreModule } from './core/core.module';
import { SharedModule } from './shared/shared.module';


@NgModule({
  declarations: [
    AppComponent,
    RadarWeekComponent,
    RadarDayComponent,
    RadarDaySearchComponent,
    RadarDayInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    HomeModule,
    CoreModule,
    SharedModule
  ],
  providers: [
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
