package com.charlatano.game.offsets

import com.charlatano.game.CSGO.engineDLL
import com.charlatano.utils.extensions.invoke
import com.charlatano.utils.get

object EngineOffsets {

	val dwClientState by engineDLL(1)(0xA1, 0[4], 0xF3, 0x0F, 0x11, 0x80, 0[4], 0xD9, 0x46, 0x04, 0xD9, 0x05)
	val dwInGame by engineDLL(2, subtract = false)(131, 185, 0[4], 6, 15, 148, 192, 195)
	val dwGlobalVars by engineDLL(1)(0xA1, 0[4], 0x5F, 0x8B, 0x40, 0x10)
	val dwViewAngles by engineDLL(4, subtract = false)(0xF3, 0x0F, 0x11, 0x80, 0[4], 0xD9, 0x46, 0x04, 0xD9, 0x05)

	val studioModel by engineDLL(0x2)(0x8B, 0x0D, 0x00, 0x00, 0x00, 0x00, 0x0F, 0xB7, 0x80,
			0x00, 0x00, 0x00, 0x00, 0x8B, 0x11, 0x89, 0x45, 0x08, 0x5D, 0xFF, 0x62, 0x38, 0x33, 0xC0)

}