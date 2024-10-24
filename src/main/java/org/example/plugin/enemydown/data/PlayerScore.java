package org.example.plugin.enemydown.data;

import lombok.Getter;
import lombok.Setter;

/*
* EnemyDownのゲームを実行する際のスコアを扱うオブジェクト。
* プレイヤー名、合計点数、日時などの情報を持つ。
* */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerScore {

  private String playerName;
  private int score;

}
