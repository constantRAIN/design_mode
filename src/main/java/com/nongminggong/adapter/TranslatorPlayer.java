package com.nongminggong.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zxliuyu
 * @date : 2022-12-10 17:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TranslatorPlayer extends Player {
	private ForeignCenterPlayer foreignCenterPlayer = new ForeignCenterPlayer();

	public void attack() {
		foreignCenterPlayer.attack();
	}

	public void defense() {
		foreignCenterPlayer.defense();
	}
}
