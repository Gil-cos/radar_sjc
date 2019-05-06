import { Component, OnInit } from '@angular/core';
import { RadarDia } from 'src/app/model/RadarDia';
import { RadarService } from 'src/app/service/radar/radar.service';

export interface Day {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-radar-day-search',
  templateUrl: './radar-day-search.component.html',
  styleUrls: ['./radar-day-search.component.css']
})
export class RadarDaySearchComponent implements OnInit {

  week: Day[] = [
    { value: 'SEGUNDA', viewValue: 'Segunda-Feira' },
    { value: 'TERÇA', viewValue: 'Terça-Feira' },
    { value: 'QUARTA', viewValue: 'Quarta-Feira' },
    { value: 'QUINTA', viewValue: 'Quinta-Feira' },
    { value: 'SEXTA', viewValue: 'Sexta-Feira' },
    { value: 'SABADO', viewValue: 'Sabado' },
    { value: 'DOMINGO', viewValue: 'Domingo' }
  ];

  selected = '';
  public day: RadarDia;

  constructor(
    private radarService: RadarService
  ) { }

  ngOnInit() {
  }

  search() {
    if (this.selected) {
      this.radarService.getDay(this.selected)
        .subscribe(day => this.day = day)
    }
  }

}
