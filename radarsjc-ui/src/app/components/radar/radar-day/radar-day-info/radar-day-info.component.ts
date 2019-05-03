import { Component, OnInit, Input } from '@angular/core';
import { RadarDia } from 'src/app/model/RadarDia';

@Component({
  selector: 'app-radar-day-info',
  templateUrl: './radar-day-info.component.html',
  styleUrls: ['./radar-day-info.component.css']
})
export class RadarDayInfoComponent implements OnInit {

  @Input() public day: RadarDia;

  constructor() { }

  ngOnInit() {
  }

}
