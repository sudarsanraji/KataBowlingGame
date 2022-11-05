package com.kata.bnpp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class FramesBuilder {

	private static final String EMPTY = "";

	List<FrameDTO> build(String framesdata) {
		String[] records = framesdata.split(EMPTY);
		List<FrameDTO> frames = new ArrayList<>();
		int index = 0;
		for (; index < records.length - 1; index++) {
			if (frames.size() == 10) {
				break;
			}
		}
		return frames;
	}

}