/*
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import webdsl.epackage.pkgdsl.ui.internal.PkgdslActivator;

public class PkgDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PkgdslActivator.getInstance().getInjector("webdsl.epackage.pkgdsl.PkgDsl");
	}

}