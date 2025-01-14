//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.09.2018 - 15:22:42
// Last changed on: 30.09.2018 - 15:22:42
package wwcp.models.freight; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class CP_Plugdoor extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public CP_Plugdoor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[116];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 201
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Door Right
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Door Left
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 204
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 32
		bodyModel[43] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 32
		bodyModel[44] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 22
		bodyModel[45] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 25
		bodyModel[46] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 25
		bodyModel[47] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 25
		bodyModel[48] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 22
		bodyModel[49] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 25
		bodyModel[50] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 25
		bodyModel[51] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 31
		bodyModel[52] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 31
		bodyModel[53] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 79
		bodyModel[55] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 79
		bodyModel[57] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 79
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 79
		bodyModel[59] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 79
		bodyModel[61] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 17
		bodyModel[64] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 125
		bodyModel[65] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 126
		bodyModel[66] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 131
		bodyModel[67] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 132
		bodyModel[68] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 133
		bodyModel[69] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 134
		bodyModel[70] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 118
		bodyModel[71] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 119
		bodyModel[72] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 124
		bodyModel[73] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 125
		bodyModel[74] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 126
		bodyModel[75] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 127
		bodyModel[76] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 128
		bodyModel[77] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 129
		bodyModel[78] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 17
		bodyModel[79] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 17
		bodyModel[80] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 17
		bodyModel[81] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 17
		bodyModel[82] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 17
		bodyModel[83] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 17
		bodyModel[84] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 17
		bodyModel[85] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 17
		bodyModel[86] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 17
		bodyModel[87] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 17
		bodyModel[88] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 17
		bodyModel[90] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 17
		bodyModel[91] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 17
		bodyModel[92] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 17
		bodyModel[93] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 17
		bodyModel[94] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 17
		bodyModel[95] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 17
		bodyModel[96] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 17
		bodyModel[97] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 16
		bodyModel[98] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 25
		bodyModel[99] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 24
		bodyModel[100] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Door-Rightside
		bodyModel[101] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Door-Rightside
		bodyModel[102] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Door-Rightside
		bodyModel[103] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Door-Rightside
		bodyModel[104] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Door-Rightside
		bodyModel[105] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 140
		bodyModel[106] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 140
		bodyModel[107] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Door-Rightside
		bodyModel[108] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Door-Rightside
		bodyModel[109] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Door-Rightside
		bodyModel[110] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Door-Rightside
		bodyModel[111] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Door-Rightside
		bodyModel[112] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 140
		bodyModel[113] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 120

		bodyModel[0].addBox(0F, 0F, 0F, 36, 24, 1, 0F); // Box 201
		bodyModel[0].setRotationPoint(-41F, -20F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 23, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Door Right
		bodyModel[1].setRotationPoint(-5F, -19F, 10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 13, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Door Left
		bodyModel[2].setRotationPoint(-5F, -19F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 36, 24, 1, 0F); // Box 204
		bodyModel[3].setRotationPoint(-41F, -20F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 36, 24, 1, 0F); // Box 6
		bodyModel[4].setRotationPoint(8F, -20F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 36, 24, 1, 0F); // Box 7
		bodyModel[5].setRotationPoint(8F, -20F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 8
		bodyModel[6].setRotationPoint(-5F, 3F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 9
		bodyModel[7].setRotationPoint(-5F, -20F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 10
		bodyModel[8].setRotationPoint(-5F, -20F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 11
		bodyModel[9].setRotationPoint(-5F, 3F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Box 12
		bodyModel[10].setRotationPoint(-42F, -20F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Box 13
		bodyModel[11].setRotationPoint(44F, -20F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 85, 1, 20, 0F); // Box 14
		bodyModel[12].setRotationPoint(-41F, 3F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 85, 1, 20, 0F); // Box 15
		bodyModel[13].setRotationPoint(-41F, -20F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 87, 1, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-42F, -22F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-42F, -21F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-42F, -21F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 87, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-42F, -22F, 0F);

		bodyModel[18].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 18
		bodyModel[18].setRotationPoint(-19F, -20F, 11F);

		bodyModel[19].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 19
		bodyModel[19].setRotationPoint(-19F, 3F, 11F);

		bodyModel[20].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 20
		bodyModel[20].setRotationPoint(-6F, -20F, -12F);

		bodyModel[21].addBox(0F, 0F, 0F, 28, 1, 1, 0F); // Box 21
		bodyModel[21].setRotationPoint(-6F, 3F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 22
		bodyModel[22].setRotationPoint(-43F, -18F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 23
		bodyModel[23].setRotationPoint(-43F, -18F, 4.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-42.6F, -18.3F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-42.6F, -15F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-42.6F, -12F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-42.6F, -9F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-42.6F, -6F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-42.6F, -3F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-42.6F, 0F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-45F, -14F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-43F, -19F, 1.6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-44F, -20.5F, 1.6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, -0.5F, -0.3F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-44F, -21.5F, 0.1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, -0.5F, -0.3F, -2F); // Box 36
		bodyModel[35].setRotationPoint(-44F, -16.5F, 0.1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-44F, -20.5F, -0.9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, -0.5F, -2F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, -0.5F, -2F, -0.3F); // Box 38
		bodyModel[37].setRotationPoint(-44F, -20.5F, 4.1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-44F, -20.5F, 0.1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(-44F, -20.5F, 3.1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(-44F, -17.5F, 3.1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(-44F, -17.5F, 0.1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 32
		bodyModel[42].setRotationPoint(-45F, -14F, -0.5F);
		bodyModel[42].rotateAngleZ = -0.73303829F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Box 32
		bodyModel[43].setRotationPoint(-45F, -14F, 3.5F);
		bodyModel[43].rotateAngleZ = -0.73303829F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 22
		bodyModel[44].setRotationPoint(-42F, -6F, 11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 25
		bodyModel[45].setRotationPoint(-41F, 0F, 10.6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 25
		bodyModel[46].setRotationPoint(-41F, -3F, 10.6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 25
		bodyModel[47].setRotationPoint(-41F, -6F, 10.6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 22
		bodyModel[48].setRotationPoint(-36F, -6F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 25
		bodyModel[49].setRotationPoint(39F, 0F, 10.6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 25
		bodyModel[50].setRotationPoint(39F, -4F, 10.6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 31
		bodyModel[51].setRotationPoint(-41F, 0F, -11.6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 31
		bodyModel[52].setRotationPoint(-41F, -4F, -11.6F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 79
		bodyModel[53].setRotationPoint(41F, 4F, -0.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[54].setRotationPoint(47F, 3.5F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[55].setRotationPoint(47F, 3.5F, -1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[56].setRotationPoint(47F, 3.5F, 0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[57].setRotationPoint(49F, 3.5F, -0.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 79
		bodyModel[58].setRotationPoint(-44F, 4F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[59].setRotationPoint(-47F, 3.5F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[60].setRotationPoint(-46F, 3.5F, -1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[61].setRotationPoint(-47F, 3.5F, 0.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[62].setRotationPoint(-45F, 3.5F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[63].setRotationPoint(-42F, 4F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 125
		bodyModel[64].setRotationPoint(38F, -6F, -12F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[65].setRotationPoint(44F, -6F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 131
		bodyModel[66].setRotationPoint(39F, -6F, -11.6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 132
		bodyModel[67].setRotationPoint(39F, -3F, -11.6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 133
		bodyModel[68].setRotationPoint(39F, 0F, -11.6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 134
		bodyModel[69].setRotationPoint(39F, 3.3F, -11.6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
		bodyModel[70].setRotationPoint(45F, -6F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[71].setRotationPoint(45F, -6F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 124
		bodyModel[72].setRotationPoint(44.6F, -6F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 125
		bodyModel[73].setRotationPoint(44.6F, -3F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 126
		bodyModel[74].setRotationPoint(44.6F, 0F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 127
		bodyModel[75].setRotationPoint(44.6F, 3.3F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[76].setRotationPoint(-31F, 4F, -0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[77].setRotationPoint(32F, 4F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 47, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[78].setRotationPoint(-22F, 4.5F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[79].setRotationPoint(25F, 4.5F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[80].setRotationPoint(34F, 4.5F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[81].setRotationPoint(31F, 4.5F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[82].setRotationPoint(32F, 4.5F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[83].setRotationPoint(-23F, 4.5F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[84].setRotationPoint(-29F, 4.5F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[85].setRotationPoint(-32F, 4.5F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[86].setRotationPoint(-31F, 4.5F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[87].setRotationPoint(-42F, 4F, -11.9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 47, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[88].setRotationPoint(-22F, 4.5F, -11.9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[89].setRotationPoint(25F, 4.5F, -11.9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[90].setRotationPoint(34F, 4.5F, -11.9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[91].setRotationPoint(31F, 4.5F, -11.9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[92].setRotationPoint(32F, 4.5F, -11.9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[93].setRotationPoint(-23F, 4.5F, -11.9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[94].setRotationPoint(-29F, 4.5F, -11.9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[95].setRotationPoint(-32F, 4.5F, -11.9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[96].setRotationPoint(-31F, 4.5F, -11.9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 87, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[97].setRotationPoint(-42F, -21F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 25
		bodyModel[98].setRotationPoint(-41F, 3.3F, 10.6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.1F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 24
		bodyModel[99].setRotationPoint(-42.6F, 3.3F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Door-Rightside
		bodyModel[100].setRotationPoint(-4F, -19F, 11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Door-Rightside
		bodyModel[101].setRotationPoint(6F, -19F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Door-Rightside
		bodyModel[102].setRotationPoint(1F, -2.5F, 10.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, -2.25F, -0.75F, -0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, 1.75F, -0.75F, -0.5F, 1.75F, 0F, 0F, -0.5F, 0F); // Door-Rightside
		bodyModel[103].setRotationPoint(-3F, -3F, 11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, -2.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, 1.75F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, 1.75F, 0F); // Door-Rightside
		bodyModel[104].setRotationPoint(1F, -3F, 11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, -1F, 0F); // Box 140
		bodyModel[105].setRotationPoint(-35F, -20F, 10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, 0F, 0.1F, 0F, 0F); // Box 140
		bodyModel[106].setRotationPoint(37F, -20F, 10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Door-Rightside
		bodyModel[107].setRotationPoint(6F, -19F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Door-Rightside
		bodyModel[108].setRotationPoint(-4F, -19F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Door-Rightside
		bodyModel[109].setRotationPoint(1F, -2.5F, -11.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -2.25F, -0.75F, -0.5F, 1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 1.75F, -0.75F); // Door-Rightside
		bodyModel[110].setRotationPoint(1F, -3F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, -0.75F, 0F, -0.5F, -0.75F); // Door-Rightside
		bodyModel[111].setRotationPoint(-3F, -3F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, -0.5F, 0.1F, 0F, -0.5F); // Box 140
		bodyModel[112].setRotationPoint(37F, -20F, -11.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, -1F, -0.5F); // Box 140
		bodyModel[113].setRotationPoint(-35F, -20F, -11.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 117
		bodyModel[114].setRotationPoint(-40.8F, -21.7F, 6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 120
		bodyModel[115].setRotationPoint(-40.5F, -21.7F, 9F);
	}
}