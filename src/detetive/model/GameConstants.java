package detetive.model;

import java.awt.Color;

public final class GameConstants {
	public static final int CHARACTERS[][] = { { 8, 24 }, { 6, 1 }, { 19, 1 },
			{ 25, 10 }, { 1, 17 }, { 25, 15 } };

	public static final int WEAPONS[][] = { { 11, 11 }, { 13, 11 }, { 15, 11 },
			{ 11, 13 }, { 13, 13 }, { 15, 13 } };

	public static final Color COLORS[] = { Color.YELLOW, Color.BLACK,
			Color.MAGENTA, Color.BLUE.darker(), Color.PINK, Color.WHITE };

	public static final String STURNS[] = { "rsc/Sounds/turn_CM.wav",
			"rsc/Sounds/turn_PP.wav", "rsc/Sounds/turn_MP.wav",
			"rsc/Sounds/turn_MG.wav", "rsc/Sounds/turn_MS.wav",
			"rsc/Sounds/turn_MW.wav" };

	public static final String SACCUSEDC[] = {
			"rsc/Sounds/accuse correct CM.wav",
			"rsc/Sounds/accuse correct PP.wav",
			"rsc/Sounds/accuse correct MP.wav",
			"rsc/Sounds/accuse correct MG.wav",
			"rsc/Sounds/accuse correct MS.wav",
			"rsc/Sounds/accuse correct MW.wav" };

	public static final String SACCUSEDI[] = {
			"rsc/Sounds/accuse incorrect CM.wav",
			"rsc/Sounds/accuse incorrect PP.wav",
			"rsc/Sounds/accuse incorrect MP.wav",
			"rsc/Sounds/accuse incorrect MG.wav",
			"rsc/Sounds/accuse incorrect MS.wav",
			"rsc/Sounds/accuse incorrect MW.wav" };

	public static final String IPORTRAIT[] = { "rsc/Images/mustardphoto.jpg",
			"rsc/Images/plumphoto.jpg", "rsc/Images/peacockphoto.jpg",
			"rsc/Images/greenphoto.jpg", "rsc/Images/scarletphoto.jpg",
			"rsc/Images/whitephoto.jpg" };

	public static final String STHUNDER[] = {
			"rsc/Sounds/wind light gusts.wav",
			"rsc/Sounds/wind heavy gusts.wav", "rsc/Sounds/SmallThunder6.wav",
			"rsc/Sounds/SmallThunder7.wav", "rsc/Sounds/SmallThunder8.wav",
			"rsc/Sounds/mnThndr1.WAV", "rsc/Sounds/mnThndr2.WAV",
			"rsc/Sounds/MidThunder1.wav", "rsc/Sounds/MidThunder2.wav",
			"rsc/Sounds/MidThunder3.wav", "rsc/Sounds/BigThunder4.wav",
			"rsc/Sounds/BigThunder5.wav" };

	public static final String SOUNDS[] = { "rsc/Sounds/SDcard.wav",
			"rsc/Sounds/door open.wav", "rsc/Sounds/door close.wav" };

	public static final String CARDS[] = { "Cel. Mostarda", "Prof. Black",
			"Dona Violeta", "Sr. Marinho", "Srta. Rosa", "Dona Branca", "Faca",
			"Candelabro", "Revolver", "Corda", "Cano", "Chave Inglesa", "Hall",
			"Sala de Estar", "Cozinha", "Sala de Jantar", "Salão de Festas",
			"Sala de Música", "Salão de Jogos", "Biblioteca", "Escritório" };

	public static final char BOARD[][] = {/* 27x26 */
			{ 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',
					'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',
					'x' },
			{ 'x', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'o', 'x', 'h', 'h', 'h',
					'h', 'h', 'h', 'x', 'o', 'x', 't', 't', 't', 't', 't', 't',
					'x' },
			{ 'x', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'o', 'o', 'h', 'h', 'h',
					'h', 'h', 'h', 'o', 'o', 't', 't', 't', 't', 't', 't', 't',
					'x' },
			{ 'x', 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'o', 'o', 'h', 'h', 'h',
					'h', 'h', 'h', 'o', 'o', 't', 't', 't', 't', 't', 't', 't',
					'x' },
			{ 'x', 'e', 'e', 'e', 'e', 'e', 'e', 'E', 'o', 'o', 'h', 'h', 'h',
					'h', 'h', 'h', 'o', 'o', 't', 't', 't', 't', 't', 't', 't',
					'x' },
			{ 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'p', 'o', 'p', 'H', 'h', 'h',
					'h', 'h', 'h', 'o', 'o', 't', 't', 't', 't', 't', 't', 't',
					'x' },
			{ 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'h', 'h', 'h',
					'h', 'h', 'h', 'o', 'o', 'T', 't', 't', 't', 't', 't', 't',
					'x' },
			{ 'x', 'x', 'b', 'b', 'b', 'b', 'b', 'o', 'o', 'o', 'h', 'h', 'H',
					'H', 'h', 'h', 'o', 'o', 'p', 'o', 'o', 'o', 'o', 'o', 'x',
					'x' },
			{ 'x', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'o', 'o', 'o', 'o', 'p',
					'p', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o',
					'x' },
			{ 'x', 'b', 'b', 'b', 'b', 'b', 'b', 'B', 'p', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'o', 'o', 'p', 'o', 'o', 'o', 'o', 'o', 'x',
					'x' },
			{ 'x', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'o', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'o', 'j', 'J', 'j', 'j', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'x', 'b', 'b', 'B', 'b', 'b', 'o', 'o', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'o', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'x', 'p', 'o', 'p', 'o', 'o', 'o', 'o', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'o', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'g', 'G', 'g', 'g', 'g', 'g', 'o', 'o', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'p', 'J', 'j', 'j', 'j', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'g', 'g', 'g', 'g', 'g', 'g', 'o', 'o', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'o', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'g', 'g', 'g', 'g', 'g', 'g', 'o', 'o', 'o', 'a', 'a', 'a',
					'a', 'a', 'o', 'o', 'j', 'j', 'j', 'j', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'g', 'g', 'g', 'g', 'g', 'G', 'p', 'o', 'o', 'o', 'o', 'o',
					'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'j', 'j', 'j', 'j',
					'x' },
			{ 'x', 'g', 'g', 'g', 'g', 'g', 'g', 'o', 'o', 'o', 'p', 'o', 'o',
					'o', 'o', 'p', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x',
					'x' },
			{ 'x', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'f', 'F', 'f', 'f',
					'f', 'f', 'F', 'f', 'o', 'o', 'o', 'p', 'o', 'o', 'o', 'o',
					'x' },
			{ 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'f', 'f', 'f', 'f',
					'f', 'f', 'f', 'f', 'o', 'o', 'c', 'C', 'c', 'c', 'c', 'c',
					'x' },
			{ 'x', 'x', 'm', 'm', 'm', 'M', 'p', 'o', 'p', 'F', 'f', 'f', 'f',
					'f', 'f', 'f', 'F', 'p', 'o', 'c', 'c', 'c', 'c', 'c', 'c',
					'x' },
			{ 'x', 'm', 'm', 'm', 'm', 'm', 'm', 'o', 'o', 'f', 'f', 'f', 'f',
					'f', 'f', 'f', 'f', 'o', 'o', 'c', 'c', 'c', 'c', 'c', 'c',
					'x' },
			{ 'x', 'm', 'm', 'm', 'm', 'm', 'm', 'o', 'o', 'f', 'f', 'f', 'f',
					'f', 'f', 'f', 'f', 'o', 'o', 'c', 'c', 'c', 'c', 'c', 'c',
					'x' },
			{ 'x', 'm', 'm', 'm', 'm', 'm', 'm', 'o', 'o', 'f', 'f', 'f', 'f',
					'f', 'f', 'f', 'f', 'o', 'o', 'c', 'c', 'c', 'c', 'c', 'c',
					'x' },
			{ 'x', 'm', 'm', 'm', 'm', 'm', 'm', 'x', 'o', 'o', 'o', 'f', 'f',
					'f', 'f', 'o', 'o', 'o', 'x', 'c', 'c', 'c', 'c', 'c', 'c',
					'x' },
			{ 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x',
					'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',
					'x' },
			{ 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',
					'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x',
					'x' } };
}
