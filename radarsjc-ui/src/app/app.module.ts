import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MaterialModule } from './material/material.module';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './components/navigation/header/header.component';
import { SidenavListComponent } from './components/navigation/sidenav-list/sidenav-list.component';
import { HomeComponent } from './components/home/home.component';
import { LayoutComponent } from './layout/layout.component';
import { FlexLayoutModule } from '@angular/flex-layout';
import { RadarWeekComponent } from './components/radar/radar-week/radar-week.component';
import { RadarDaySearchComponent } from './components/radar/radar-day/radar-day-search/radar-day-search.component';
import { RadarDayComponent } from './components/radar/radar-day/radar-day.component';
import { RadarService } from './service/radar/radar.service';
import { RadarDayInfoComponent } from './components/radar/radar-day/radar-day-info/radar-day-info.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidenavListComponent,
    HomeComponent,
    LayoutComponent,
    RadarWeekComponent,
    RadarDayComponent,
    RadarDaySearchComponent,
    RadarDayInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule,
    FlexLayoutModule
  ],
  providers: [
    RadarService
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
