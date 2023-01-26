package codemdr.lexer

import org.ascore.lang.ASCLexer

/**
 * This class is used to lex the source code. Override and edit the [lex] method to change the
 * lexing behavior.
 */
class CodeMdrLexer(filePath: String) : ASCLexer(CodeMdrLexer::class.java.getResourceAsStream(filePath)) {
    override fun sortTokenRules() {
    }
}
