package com.purpendiculr.extensions.controllers.presonus.atom;

import com.bitwig.extension.controller.api.ControllerHost;
import com.bitwig.extensions.util.NoteInputUtils;

public class AtomNoteInputUtils extends NoteInputUtils {
	public static Integer[] SCALE_NOTES;

	static {
		SCALE_NOTES = new Integer[128];

		for (int i = 0; i < 36; i++) {
			SCALE_NOTES[i] = -1;
		}

		SCALE_NOTES[36] = 36;
		SCALE_NOTES[37] = 38;
		SCALE_NOTES[38] = 40;
		SCALE_NOTES[39] = 41;
		SCALE_NOTES[40] = 41;
		SCALE_NOTES[41] = 43;
		SCALE_NOTES[42] = 45;
		SCALE_NOTES[43] = 47;
		SCALE_NOTES[44] = 47;
		SCALE_NOTES[45] = 48;
		SCALE_NOTES[46] = 50;
		SCALE_NOTES[47] = 52;
		SCALE_NOTES[48] = 52;
		SCALE_NOTES[49] = 53;
		SCALE_NOTES[50] = 55;
		SCALE_NOTES[51] = 57;

		for (int i = 52; i < 128; i++) {
			SCALE_NOTES[i] = -1;
		}
	}

	public static Integer[] padsWithOffset(int offset) {
		Integer[] NOTES = new Integer[128];

		for (int i = 0; i < 36; i++) {
			NOTES[i] = -1;
		}

		for (int i = 36; i < 52; i++) {
			NOTES[i] = i + offset;
		}

		for (int i = 52; i < 128; i++) {
			NOTES[i] = -1;
		}
		
		return NOTES;

	}

	public static void printMidi(ControllerHost host, int a, int b, int c) {
		host.println(Integer.toHexString(a) + " " + Integer.toHexString(b) + " " + Integer.toHexString(c));
	}
}
