/*
 * generated by Xtext 2.25.0
 */
package webdsl.epackage.pkgdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PkgDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("webdsl/epackage/pkgdsl/parser/antlr/internal/InternalPkgDsl.tokens");
	}
}
