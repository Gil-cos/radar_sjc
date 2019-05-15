import { Component, EventEmitter, OnInit, Output } from '@angular/core';

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

  @Output() selectedOption = new EventEmitter<String>()
  selected = '';
  
  constructor() {
  }

  ngOnInit() {
  }

  search() {
    this.selectedOption.emit(this.selected);
  }

}
