package com.crow.nanahoshi.app;

import com.crow.nanahoshi.ui.MainScreen;
import com.crow.nanahoshi.util.ErrorHandler;

public class AppLauncher {
	public static void launch() {
		try {
			MainScreen.buildScreen();
		} catch (Exception e) {
			ErrorHandler.handle(e, "Inicialização da Interface Gráfica");
		}
	}
}
