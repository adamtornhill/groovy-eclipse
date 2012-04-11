// $ANTLR 2.7.7 (20060906): "groovy.g" -> "GroovyRecognizer.java"$

package org.codehaus.groovy.antlr.parser;
import org.codehaus.groovy.antlr.*;
import java.util.*;
import java.io.InputStream;
import java.io.Reader;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.CommonToken;
import org.codehaus.groovy.GroovyBugError;
import antlr.TokenStreamRecognitionException;
import org.codehaus.groovy.ast.Comment;

public interface GroovyTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int BLOCK = 4;
	int MODIFIERS = 5;
	int OBJBLOCK = 6;
	int SLIST = 7;
	int METHOD_DEF = 8;
	int VARIABLE_DEF = 9;
	int INSTANCE_INIT = 10;
	int STATIC_INIT = 11;
	int TYPE = 12;
	int CLASS_DEF = 13;
	int INTERFACE_DEF = 14;
	int PACKAGE_DEF = 15;
	int ARRAY_DECLARATOR = 16;
	int EXTENDS_CLAUSE = 17;
	int IMPLEMENTS_CLAUSE = 18;
	int PARAMETERS = 19;
	int PARAMETER_DEF = 20;
	int LABELED_STAT = 21;
	int TYPECAST = 22;
	int INDEX_OP = 23;
	int POST_INC = 24;
	int POST_DEC = 25;
	int METHOD_CALL = 26;
	int EXPR = 27;
	int IMPORT = 28;
	int UNARY_MINUS = 29;
	int UNARY_PLUS = 30;
	int CASE_GROUP = 31;
	int ELIST = 32;
	int FOR_INIT = 33;
	int FOR_CONDITION = 34;
	int FOR_ITERATOR = 35;
	int EMPTY_STAT = 36;
	int FINAL = 37;
	int ABSTRACT = 38;
	int UNUSED_GOTO = 39;
	int UNUSED_CONST = 40;
	int UNUSED_DO = 41;
	int STRICTFP = 42;
	int SUPER_CTOR_CALL = 43;
	int CTOR_CALL = 44;
	int CTOR_IDENT = 45;
	int VARIABLE_PARAMETER_DEF = 46;
	int STRING_CONSTRUCTOR = 47;
	int STRING_CTOR_MIDDLE = 48;
	int CLOSABLE_BLOCK = 49;
	int IMPLICIT_PARAMETERS = 50;
	int SELECT_SLOT = 51;
	int DYNAMIC_MEMBER = 52;
	int LABELED_ARG = 53;
	int SPREAD_ARG = 54;
	int SPREAD_MAP_ARG = 55;
	int LIST_CONSTRUCTOR = 56;
	int MAP_CONSTRUCTOR = 57;
	int FOR_IN_ITERABLE = 58;
	int STATIC_IMPORT = 59;
	int ENUM_DEF = 60;
	int ENUM_CONSTANT_DEF = 61;
	int FOR_EACH_CLAUSE = 62;
	int ANNOTATION_DEF = 63;
	int ANNOTATIONS = 64;
	int ANNOTATION = 65;
	int ANNOTATION_MEMBER_VALUE_PAIR = 66;
	int ANNOTATION_FIELD_DEF = 67;
	int ANNOTATION_ARRAY_INIT = 68;
	int TYPE_ARGUMENTS = 69;
	int TYPE_ARGUMENT = 70;
	int TYPE_PARAMETERS = 71;
	int TYPE_PARAMETER = 72;
	int WILDCARD_TYPE = 73;
	int TYPE_UPPER_BOUNDS = 74;
	int TYPE_LOWER_BOUNDS = 75;
	int CLOSURE_LIST = 76;
	int MULTICATCH = 77;
	int MULTICATCH_TYPES = 78;
	int SH_COMMENT = 79;
	int LITERAL_package = 80;
	int LITERAL_import = 81;
	int LITERAL_static = 82;
	int LITERAL_def = 83;
	int LBRACK = 84;
	int RBRACK = 85;
	int IDENT = 86;
	int STRING_LITERAL = 87;
	int LT = 88;
	int DOT = 89;
	int LPAREN = 90;
	int LITERAL_class = 91;
	int LITERAL_interface = 92;
	int LITERAL_enum = 93;
	int AT = 94;
	int QUESTION = 95;
	int LITERAL_extends = 96;
	int LITERAL_super = 97;
	int GT = 98;
	int COMMA = 99;
	int SR = 100;
	int BSR = 101;
	int LITERAL_void = 102;
	int LITERAL_boolean = 103;
	int LITERAL_byte = 104;
	int LITERAL_char = 105;
	int LITERAL_short = 106;
	int LITERAL_int = 107;
	int LITERAL_float = 108;
	int LITERAL_long = 109;
	int LITERAL_double = 110;
	int STAR = 111;
	int LITERAL_as = 112;
	int LITERAL_private = 113;
	int LITERAL_public = 114;
	int LITERAL_protected = 115;
	int LITERAL_transient = 116;
	int LITERAL_native = 117;
	int LITERAL_threadsafe = 118;
	int LITERAL_synchronized = 119;
	int LITERAL_volatile = 120;
	int RPAREN = 121;
	int ASSIGN = 122;
	int BAND = 123;
	int LCURLY = 124;
	int RCURLY = 125;
	int SEMI = 126;
	int LITERAL_default = 127;
	int LITERAL_throws = 128;
	int LITERAL_implements = 129;
	int LITERAL_this = 130;
	int TRIPLE_DOT = 131;
	int BOR = 132;
	int CLOSABLE_BLOCK_OP = 133;
	int COLON = 134;
	int LITERAL_if = 135;
	int LITERAL_else = 136;
	int LITERAL_while = 137;
	int LITERAL_switch = 138;
	int LITERAL_for = 139;
	int LITERAL_in = 140;
	int LITERAL_return = 141;
	int LITERAL_break = 142;
	int LITERAL_continue = 143;
	int LITERAL_throw = 144;
	int LITERAL_assert = 145;
	int PLUS = 146;
	int MINUS = 147;
	int LITERAL_case = 148;
	int LITERAL_try = 149;
	int LITERAL_finally = 150;
	int LITERAL_catch = 151;
	int SPREAD_DOT = 152;
	int OPTIONAL_DOT = 153;
	int MEMBER_POINTER = 154;
	int LITERAL_false = 155;
	int LITERAL_instanceof = 156;
	int LITERAL_new = 157;
	int LITERAL_null = 158;
	int LITERAL_true = 159;
	int PLUS_ASSIGN = 160;
	int MINUS_ASSIGN = 161;
	int STAR_ASSIGN = 162;
	int DIV_ASSIGN = 163;
	int MOD_ASSIGN = 164;
	int SR_ASSIGN = 165;
	int BSR_ASSIGN = 166;
	int SL_ASSIGN = 167;
	int BAND_ASSIGN = 168;
	int BXOR_ASSIGN = 169;
	int BOR_ASSIGN = 170;
	int STAR_STAR_ASSIGN = 171;
	int ELVIS_OPERATOR = 172;
	int LOR = 173;
	int LAND = 174;
	int BXOR = 175;
	int REGEX_FIND = 176;
	int REGEX_MATCH = 177;
	int NOT_EQUAL = 178;
	int EQUAL = 179;
	int IDENTICAL = 180;
	int NOT_IDENTICAL = 181;
	int COMPARE_TO = 182;
	int LE = 183;
	int GE = 184;
	int SL = 185;
	int RANGE_INCLUSIVE = 186;
	int RANGE_EXCLUSIVE = 187;
	int INC = 188;
	int DIV = 189;
	int MOD = 190;
	int DEC = 191;
	int STAR_STAR = 192;
	int BNOT = 193;
	int LNOT = 194;
	int STRING_CTOR_START = 195;
	int STRING_CTOR_END = 196;
	int NUM_INT = 197;
	int NUM_FLOAT = 198;
	int NUM_LONG = 199;
	int NUM_DOUBLE = 200;
	int NUM_BIG_INT = 201;
	int NUM_BIG_DECIMAL = 202;
	int NLS = 203;
	int DOLLAR = 204;
	int WS = 205;
	int ONE_NL = 206;
	int ONE_NL_KEEP = 207;
	int SL_COMMENT = 208;
	int ML_COMMENT = 209;
	int STRING_CH = 210;
	int REGEXP_LITERAL = 211;
	int DOLLAR_REGEXP_LITERAL = 212;
	int REGEXP_CTOR_END = 213;
	int DOLLAR_REGEXP_CTOR_END = 214;
	int ESCAPED_SLASH = 215;
	int ESCAPED_DOLLAR = 216;
	int REGEXP_SYMBOL = 217;
	int DOLLAR_REGEXP_SYMBOL = 218;
	int ESC = 219;
	int STRING_NL = 220;
	int HEX_DIGIT = 221;
	int VOCAB = 222;
	int LETTER = 223;
	int DIGIT = 224;
	int DIGITS_WITH_UNDERSCORE = 225;
	int DIGITS_WITH_UNDERSCORE_OPT = 226;
	int EXPONENT = 227;
	int FLOAT_SUFFIX = 228;
	int BIG_SUFFIX = 229;
}
