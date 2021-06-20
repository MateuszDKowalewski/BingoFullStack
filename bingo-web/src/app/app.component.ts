import {Component, OnInit} from '@angular/core';
import {FieldDto} from './field-dto-model';
import {AppService} from "./app.service";

export interface Tile {
  cols: number;
  rows: number;
  text: string;
  clicked: boolean;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public tiles: Tile[] = [];
  public win = false;

  constructor(private appService: AppService) { }

  ngOnInit(): void {
    this.appService.getRandomBoard().subscribe((result: FieldDto[]) => {
      result.forEach(field => {
        this.tiles.push({
          cols: 1,
          rows: 1,
          text: field.content,
          clicked: false
        } as Tile);
      });
    })
  }

  clicked(tile: Tile) {
    if(!this.win) {
      tile.clicked = !tile.clicked;
      this.win = this.checkGameState();
    }
  }

  private checkGameState() :boolean {
    for(let i = 0; i < 5; i++) {
      let row = true;
      let col = true;
      for(let j = 0; j < 5; j++) {
        if(!this.tiles[5 * i + j].clicked) {
          row = false;
        }
        if(!this.tiles[i + 5 * j].clicked) {
          col = false;
        }
      }
      if(row || col) {
        return  true;
      }
    }

    let leftDiag = true;
    for(let i = 0; i < 5; i++) {
      if(!this.tiles[6 * i].clicked) {
        leftDiag = false
      }
    }
    if(leftDiag) {
      return true;
    }

    let rightDiag = true;
    for(let i = 0; i < 5; i++) {
      if(!this.tiles[4 * i + 4].clicked) {
        rightDiag = false
      }
    }
    if(rightDiag) {
      return true;
    }

    return false;
  }
}
