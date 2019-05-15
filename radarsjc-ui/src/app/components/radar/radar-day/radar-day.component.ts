import { Component, OnInit } from '@angular/core';
import { RadarService } from 'src/app/service/radar/radar.service';
import { RadarDia } from 'src/app/model/RadarDia';

@Component({
  selector: 'app-radar-day',
  templateUrl: './radar-day.component.html',
  styleUrls: ['./radar-day.component.css']
})
export class RadarDayComponent implements OnInit {

  public day: RadarDia;

  constructor(
    private radarService: RadarService
  ) { }

  ngOnInit() {
  }

  getDay(selected: string) {
    if (selected) {
      this.radarService.getDay(selected)
        .subscribe(day => this.day = day)
    }
  }

}
