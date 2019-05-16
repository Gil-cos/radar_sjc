import { Component, OnInit, Input } from '@angular/core';
import { RadarDia } from 'src/app/model/RadarDia';

@Component({
  selector: 'app-radar-details',
  templateUrl: './radar-details.component.html',
  styleUrls: ['./radar-details.component.css']
})
export class RadarDetailsComponent implements OnInit {

  @Input() day: RadarDia;
  locals: string[];

  constructor() { }

  ngOnInit() {
    this.formatLocal(this.day);
  }

  formatLocal(day: RadarDia) {
    this.locals = day.local.split('-');
  }

}
