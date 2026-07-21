// $ANTLR 3.5.2 Proguard.g 2017-05-31 21:29:09

package com.android.build.gradle.shrinker.parser;
import static com.android.build.gradle.shrinker.parser.ModifierSpecification.*;
import static org.objectweb.asm.Opcodes.*;
import com.android.build.gradle.shrinker.parser.GrammarActions;
import com.android.build.gradle.shrinker.parser.GrammarActions.FilterSeparator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProguardParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINE_COMMENT", "NAME", "NEGATOR", 
		"WS", "'%'", "'('", "')'", "','", "'-adaptclassstrings'", "'-adaptresourcefilecontents'", 
		"'-adaptresourcefilenames'", "'-allowaccessmodification'", "'-applymapping'", 
		"'-assumenosideeffects'", "'-basedirectory'", "'-classobfuscationdictionary'", 
		"'-dontnote'", "'-dontobfuscate'", "'-dontoptimize'", "'-dontpreverify'", 
		"'-dontshrink'", "'-dontskipnonpubliclibraryclasses'", "'-dontskipnonpubliclibraryclassmembers'", 
		"'-dontusemixedcaseclassnames'", "'-dontwarn'", "'-dump'", "'-flattenpackagehierarchy'", 
		"'-forceprocessing'", "'-ignorewarnings'", "'-include'", "'-injars'", 
		"'-keep'", "'-keepattributes'", "'-keepclasseswithmembernames'", "'-keepclasseswithmembers'", 
		"'-keepclassmembernames'", "'-keepclassmembers'", "'-keepdirectories'", 
		"'-keepnames'", "'-keeppackagenames'", "'-keepparameternames'", "'-libraryjars'", 
		"'-mergeinterfacesaggressively'", "'-microedition'", "'-obfuscationdictionary'", 
		"'-optimizationpasses'", "'-optimizations'", "'-outjars'", "'-overloadaggressively'", 
		"'-packageobfuscationdictionary'", "'-printconfiguration'", "'-printmapping'", 
		"'-printseeds'", "'-printusage'", "'-renamesourcefileattribute'", "'-repackageclasses'", 
		"'-skipnonpubliclibraryclasses'", "'-target'", "'-useuniqueclassmembernames'", 
		"'-verbose'", "'-whyareyoukeeping'", "':'", "';'", "'<fields>'", "'<init>'", 
		"'<methods>'", "'@'", "'[]'", "'\\''", "'abstract'", "'allowobfuscation'", 
		"'allowoptimization'", "'allowshrinking'", "'bridge'", "'class'", "'enum'", 
		"'extends'", "'final'", "'implements'", "'interface'", "'native'", "'private'", 
		"'protected'", "'public'", "'static'", "'strictfp'", "'synchronized'", 
		"'synthetic'", "'transient'", "'varargs'", "'volatile'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int LINE_COMMENT=4;
	public static final int NAME=5;
	public static final int NEGATOR=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProguardParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProguardParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProguardParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Proguard.g"; }


	  @Override
	  public void emitErrorMessage(String msg) {
	    throw new ProguardParserException(msg);
	  }



	// $ANTLR start "prog"
	// Proguard.g:37:1: prog[Flags flags, String baseDirectory] : ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )* EOF ;
	public final void prog(Flags flags, String baseDirectory) throws RecognitionException {
		Token baseDir=null;
		Token proguardFile=null;
		Token target=null;
		KeepModifier keepModifier =null;
		ClassSpecification classSpec =null;
		ParserRuleReturnScope igFlag =null;
		ParserRuleReturnScope nopFlag =null;
		ParserRuleReturnScope unFlag =null;

		try {
			// Proguard.g:38:3: ( ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )* EOF )
			// Proguard.g:39:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )* EOF
			{
			// Proguard.g:39:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification ) | ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] ) | ( '-ignorewarnings' ) | ( '-target' target= NAME ) | ( '-whyareyoukeeping' classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontobfuscate' ) )*
			loop1:
			while (true) {
				int alt1=16;
				switch ( input.LA(1) ) {
				case 18:
					{
					alt1=1;
					}
					break;
				case 33:
				case 70:
					{
					alt1=2;
					}
					break;
				case 40:
					{
					alt1=3;
					}
					break;
				case 38:
					{
					alt1=4;
					}
					break;
				case 35:
					{
					alt1=5;
					}
					break;
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 19:
				case 30:
				case 46:
				case 48:
				case 49:
				case 50:
				case 52:
				case 53:
				case 58:
				case 59:
				case 62:
					{
					alt1=6;
					}
					break;
				case 20:
				case 23:
				case 25:
				case 26:
				case 27:
				case 36:
				case 37:
				case 39:
				case 42:
				case 43:
				case 44:
				case 60:
				case 63:
					{
					alt1=7;
					}
					break;
				case 29:
				case 31:
				case 34:
				case 41:
				case 45:
				case 47:
				case 51:
				case 54:
				case 55:
				case 56:
				case 57:
					{
					alt1=8;
					}
					break;
				case 28:
					{
					alt1=9;
					}
					break;
				case 32:
					{
					alt1=10;
					}
					break;
				case 61:
					{
					alt1=11;
					}
					break;
				case 64:
					{
					alt1=12;
					}
					break;
				case 24:
					{
					alt1=13;
					}
					break;
				case 22:
					{
					alt1=14;
					}
					break;
				case 21:
					{
					alt1=15;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// Proguard.g:40:5: ( '-basedirectory' baseDir= NAME )
					{
					// Proguard.g:40:5: ( '-basedirectory' baseDir= NAME )
					// Proguard.g:40:6: '-basedirectory' baseDir= NAME
					{
					match(input,18,FOLLOW_18_in_prog81); 
					baseDir=(Token)match(input,NAME,FOLLOW_NAME_in_prog85); 
					baseDirectory=(baseDir!=null?baseDir.getText():null);
					}

					}
					break;
				case 2 :
					// Proguard.g:41:7: ( '-include' | '@' ) proguardFile= NAME
					{
					if ( input.LA(1)==33||input.LA(1)==70 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					proguardFile=(Token)match(input,NAME,FOLLOW_NAME_in_prog104); 
					GrammarActions.include((proguardFile!=null?proguardFile.getText():null), baseDirectory, flags);
					}
					break;
				case 3 :
					// Proguard.g:42:7: ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:42:7: ( '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:42:8: '-keepclassmembers' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,40,FOLLOW_40_in_prog115); 
					pushFollow(FOLLOW_keepOptionModifier_in_prog119);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_prog123);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 4 :
					// Proguard.g:43:7: ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:43:7: ( '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:43:8: '-keepclasseswithmembers' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,38,FOLLOW_38_in_prog135); 
					pushFollow(FOLLOW_keepOptionModifier_in_prog139);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_prog143);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassesWithMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 5 :
					// Proguard.g:44:7: ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification )
					{
					// Proguard.g:44:7: ( '-keep' keepModifier= keepOptionModifier classSpec= classSpecification )
					// Proguard.g:44:8: '-keep' keepModifier= keepOptionModifier classSpec= classSpecification
					{
					match(input,35,FOLLOW_35_in_prog155); 
					pushFollow(FOLLOW_keepOptionModifier_in_prog159);
					keepModifier=keepOptionModifier();
					state._fsp--;

					pushFollow(FOLLOW_classSpecification_in_prog163);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassSpecification(flags, classSpec, keepModifier);
					}

					}
					break;
				case 6 :
					// Proguard.g:45:7: (igFlag= ignoredFlag )
					{
					// Proguard.g:45:7: (igFlag= ignoredFlag )
					// Proguard.g:45:8: igFlag= ignoredFlag
					{
					pushFollow(FOLLOW_ignoredFlag_in_prog177);
					igFlag=ignoredFlag();
					state._fsp--;

					GrammarActions.ignoredFlag((igFlag!=null?input.toString(igFlag.start,igFlag.stop):null), true);
					}

					}
					break;
				case 7 :
					// Proguard.g:46:7: (nopFlag= noOpFlag )
					{
					// Proguard.g:46:7: (nopFlag= noOpFlag )
					// Proguard.g:46:8: nopFlag= noOpFlag
					{
					pushFollow(FOLLOW_noOpFlag_in_prog191);
					nopFlag=noOpFlag();
					state._fsp--;

					GrammarActions.ignoredFlag((nopFlag!=null?input.toString(nopFlag.start,nopFlag.stop):null), false);
					}

					}
					break;
				case 8 :
					// Proguard.g:47:7: (unFlag= unsupportedFlag )
					{
					// Proguard.g:47:7: (unFlag= unsupportedFlag )
					// Proguard.g:47:8: unFlag= unsupportedFlag
					{
					pushFollow(FOLLOW_unsupportedFlag_in_prog205);
					unFlag=unsupportedFlag();
					state._fsp--;

					GrammarActions.unsupportedFlag((unFlag!=null?input.toString(unFlag.start,unFlag.stop):null));
					}

					}
					break;
				case 9 :
					// Proguard.g:48:7: ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] )
					{
					// Proguard.g:48:7: ( '-dontwarn' filter[class_filter, FilterSeparator.CLASS] )
					// Proguard.g:48:8: '-dontwarn' filter[class_filter, FilterSeparator.CLASS]
					{
					match(input,28,FOLLOW_28_in_prog217); 
					List<FilterSpecification> class_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_prog221);
					filter(class_filter, FilterSeparator.CLASS);
					state._fsp--;

					GrammarActions.dontWarn(flags, class_filter);
					}

					}
					break;
				case 10 :
					// Proguard.g:49:7: ( '-ignorewarnings' )
					{
					// Proguard.g:49:7: ( '-ignorewarnings' )
					// Proguard.g:49:8: '-ignorewarnings'
					{
					match(input,32,FOLLOW_32_in_prog234); 
					GrammarActions.ignoreWarnings(flags);
					}

					}
					break;
				case 11 :
					// Proguard.g:50:7: ( '-target' target= NAME )
					{
					// Proguard.g:50:7: ( '-target' target= NAME )
					// Proguard.g:50:8: '-target' target= NAME
					{
					match(input,61,FOLLOW_61_in_prog246); 
					target=(Token)match(input,NAME,FOLLOW_NAME_in_prog250); 
					GrammarActions.target(flags, (target!=null?target.getText():null));
					}

					}
					break;
				case 12 :
					// Proguard.g:51:7: ( '-whyareyoukeeping' classSpec= classSpecification )
					{
					// Proguard.g:51:7: ( '-whyareyoukeeping' classSpec= classSpecification )
					// Proguard.g:51:8: '-whyareyoukeeping' classSpec= classSpecification
					{
					match(input,64,FOLLOW_64_in_prog262); 
					pushFollow(FOLLOW_classSpecification_in_prog266);
					classSpec=classSpecification();
					state._fsp--;

					 GrammarActions.whyAreYouKeeping(flags, classSpec); 
					}

					}
					break;
				case 13 :
					// Proguard.g:52:7: ( '-dontshrink' )
					{
					// Proguard.g:52:7: ( '-dontshrink' )
					// Proguard.g:52:8: '-dontshrink'
					{
					match(input,24,FOLLOW_24_in_prog278); 
					 GrammarActions.dontShrink(flags); 
					}

					}
					break;
				case 14 :
					// Proguard.g:53:7: ( '-dontoptimize' )
					{
					// Proguard.g:53:7: ( '-dontoptimize' )
					// Proguard.g:53:8: '-dontoptimize'
					{
					match(input,22,FOLLOW_22_in_prog291); 
					 GrammarActions.dontOptimize(flags); 
					}

					}
					break;
				case 15 :
					// Proguard.g:54:7: ( '-dontobfuscate' )
					{
					// Proguard.g:54:7: ( '-dontobfuscate' )
					// Proguard.g:54:8: '-dontobfuscate'
					{
					match(input,21,FOLLOW_21_in_prog304); 
					 GrammarActions.dontObfuscate(flags); 
					}

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_prog316); 
			}

		}
		catch (RecognitionException e) {

			    throw e;
			  
		}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"


	public static class noOpFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "noOpFlag"
	// Proguard.g:62:9: private noOpFlag : ( '-verbose' | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-dontpreverify' ) ) ;
	public final ProguardParser.noOpFlag_return noOpFlag() throws RecognitionException {
		ProguardParser.noOpFlag_return retval = new ProguardParser.noOpFlag_return();
		retval.start = input.LT(1);

		ClassSpecification classSpec =null;

		try {
			// Proguard.g:63:3: ( ( '-verbose' | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-dontpreverify' ) ) )
			// Proguard.g:64:3: ( '-verbose' | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-dontpreverify' ) )
			{
			// Proguard.g:64:3: ( '-verbose' | ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] ) | ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] ) | ( '-dontpreverify' ) )
			int alt2=13;
			switch ( input.LA(1) ) {
			case 63:
				{
				alt2=1;
				}
				break;
			case 20:
				{
				alt2=2;
				}
				break;
			case 27:
				{
				alt2=3;
				}
				break;
			case 25:
				{
				alt2=4;
				}
				break;
			case 26:
				{
				alt2=5;
				}
				break;
			case 60:
				{
				alt2=6;
				}
				break;
			case 44:
				{
				alt2=7;
				}
				break;
			case 42:
				{
				alt2=8;
				}
				break;
			case 39:
				{
				alt2=9;
				}
				break;
			case 37:
				{
				alt2=10;
				}
				break;
			case 36:
				{
				alt2=11;
				}
				break;
			case 43:
				{
				alt2=12;
				}
				break;
			case 23:
				{
				alt2=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Proguard.g:64:7: '-verbose'
					{
					match(input,63,FOLLOW_63_in_noOpFlag345); 
					}
					break;
				case 2 :
					// Proguard.g:65:7: ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] )
					{
					// Proguard.g:65:7: ( '-dontnote' filter[class_filter, FilterSeparator.CLASS] )
					// Proguard.g:65:8: '-dontnote' filter[class_filter, FilterSeparator.CLASS]
					{
					match(input,20,FOLLOW_20_in_noOpFlag354); 
					List<FilterSpecification> class_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_noOpFlag358);
					filter(class_filter, FilterSeparator.CLASS);
					state._fsp--;

					}

					}
					break;
				case 3 :
					// Proguard.g:67:7: '-dontusemixedcaseclassnames'
					{
					match(input,27,FOLLOW_27_in_noOpFlag373); 
					}
					break;
				case 4 :
					// Proguard.g:68:7: '-dontskipnonpubliclibraryclasses'
					{
					match(input,25,FOLLOW_25_in_noOpFlag381); 
					}
					break;
				case 5 :
					// Proguard.g:69:7: '-dontskipnonpubliclibraryclassmembers'
					{
					match(input,26,FOLLOW_26_in_noOpFlag389); 
					}
					break;
				case 6 :
					// Proguard.g:70:7: '-skipnonpubliclibraryclasses'
					{
					match(input,60,FOLLOW_60_in_noOpFlag397); 
					}
					break;
				case 7 :
					// Proguard.g:72:7: '-keepparameternames'
					{
					match(input,44,FOLLOW_44_in_noOpFlag410); 
					}
					break;
				case 8 :
					// Proguard.g:73:7: ( '-keepnames' classSpec= classSpecification )
					{
					// Proguard.g:73:7: ( '-keepnames' classSpec= classSpecification )
					// Proguard.g:73:8: '-keepnames' classSpec= classSpecification
					{
					match(input,42,FOLLOW_42_in_noOpFlag419); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag423);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 9 :
					// Proguard.g:74:7: ( '-keepclassmembernames' classSpec= classSpecification )
					{
					// Proguard.g:74:7: ( '-keepclassmembernames' classSpec= classSpecification )
					// Proguard.g:74:8: '-keepclassmembernames' classSpec= classSpecification
					{
					match(input,39,FOLLOW_39_in_noOpFlag434); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag438);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 10 :
					// Proguard.g:75:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					{
					// Proguard.g:75:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					// Proguard.g:75:8: '-keepclasseswithmembernames' classSpec= classSpecification
					{
					match(input,37,FOLLOW_37_in_noOpFlag450); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag454);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 11 :
					// Proguard.g:76:7: ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] )
					{
					// Proguard.g:76:7: ( '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE] )
					// Proguard.g:76:8: '-keepattributes' filter[attribute_filter, FilterSeparator.ATTRIBUTE]
					{
					match(input,36,FOLLOW_36_in_noOpFlag466); 
					List<FilterSpecification> attribute_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_noOpFlag470);
					filter(attribute_filter, FilterSeparator.ATTRIBUTE);
					state._fsp--;

					}

					}
					break;
				case 12 :
					// Proguard.g:77:7: ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] )
					{
					// Proguard.g:77:7: ( '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL] )
					// Proguard.g:77:8: '-keeppackagenames' filter[package_filter, FilterSeparator.GENERAL]
					{
					match(input,43,FOLLOW_43_in_noOpFlag482); 
					List<FilterSpecification> package_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_noOpFlag486);
					filter(package_filter, FilterSeparator.GENERAL);
					state._fsp--;

					}

					}
					break;
				case 13 :
					// Proguard.g:78:7: ( '-dontpreverify' )
					{
					// Proguard.g:78:7: ( '-dontpreverify' )
					// Proguard.g:78:8: '-dontpreverify'
					{
					match(input,23,FOLLOW_23_in_noOpFlag498); 
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "noOpFlag"


	public static class ignoredFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "ignoredFlag"
	// Proguard.g:82:9: private ignoredFlag : ( ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) ) ;
	public final ProguardParser.ignoredFlag_return ignoredFlag() throws RecognitionException {
		ProguardParser.ignoredFlag_return retval = new ProguardParser.ignoredFlag_return();
		retval.start = input.LT(1);

		Token sourceFile=null;
		Token mapping=null;
		Token obfuscationDictionary=null;
		Token classObfuscationDictionary=null;
		Token packageObfuscationDictionary=null;
		Token newPackage=null;

		try {
			// Proguard.g:83:3: ( ( ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) ) )
			// Proguard.g:84:3: ( ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) )
			{
			// Proguard.g:84:3: ( ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] ) | ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] ) )
			int alt8=17;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt8=1;
				}
				break;
			case 62:
				{
				alt8=2;
				}
				break;
			case 15:
				{
				alt8=3;
				}
				break;
			case 49:
				{
				alt8=4;
				}
				break;
			case 17:
				{
				alt8=5;
				}
				break;
			case 46:
				{
				alt8=6;
				}
				break;
			case 52:
				{
				alt8=7;
				}
				break;
			case 58:
				{
				alt8=8;
				}
				break;
			case 12:
				{
				alt8=9;
				}
				break;
			case 16:
				{
				alt8=10;
				}
				break;
			case 48:
				{
				alt8=11;
				}
				break;
			case 19:
				{
				alt8=12;
				}
				break;
			case 53:
				{
				alt8=13;
				}
				break;
			case 59:
				{
				alt8=14;
				}
				break;
			case 30:
				{
				alt8=15;
				}
				break;
			case 14:
				{
				alt8=16;
				}
				break;
			case 13:
				{
				alt8=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// Proguard.g:84:7: ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] )
					{
					// Proguard.g:84:7: ( '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL] )
					// Proguard.g:84:8: '-optimizations' filter[optimization_filter, FilterSeparator.GENERAL]
					{
					match(input,50,FOLLOW_50_in_ignoredFlag527); 
					List<FilterSpecification> optimization_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_ignoredFlag531);
					filter(optimization_filter, FilterSeparator.GENERAL);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// Proguard.g:85:7: '-useuniqueclassmembernames'
					{
					match(input,62,FOLLOW_62_in_ignoredFlag541); 
					}
					break;
				case 3 :
					// Proguard.g:86:7: '-allowaccessmodification'
					{
					match(input,15,FOLLOW_15_in_ignoredFlag549); 
					}
					break;
				case 4 :
					// Proguard.g:87:7: ( '-optimizationpasses' NAME )
					{
					// Proguard.g:87:7: ( '-optimizationpasses' NAME )
					// Proguard.g:87:8: '-optimizationpasses' NAME
					{
					match(input,49,FOLLOW_49_in_ignoredFlag558); 
					match(input,NAME,FOLLOW_NAME_in_ignoredFlag560); 
					}

					}
					break;
				case 5 :
					// Proguard.g:88:7: ( '-assumenosideeffects' classSpecification )
					{
					// Proguard.g:88:7: ( '-assumenosideeffects' classSpecification )
					// Proguard.g:88:8: '-assumenosideeffects' classSpecification
					{
					match(input,17,FOLLOW_17_in_ignoredFlag571); 
					pushFollow(FOLLOW_classSpecification_in_ignoredFlag573);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 6 :
					// Proguard.g:89:7: '-mergeinterfacesaggressively'
					{
					match(input,46,FOLLOW_46_in_ignoredFlag582); 
					}
					break;
				case 7 :
					// Proguard.g:90:7: '-overloadaggressively'
					{
					match(input,52,FOLLOW_52_in_ignoredFlag590); 
					}
					break;
				case 8 :
					// Proguard.g:91:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					{
					// Proguard.g:91:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					// Proguard.g:91:8: '-renamesourcefileattribute' (sourceFile= NAME )?
					{
					match(input,58,FOLLOW_58_in_ignoredFlag599); 
					// Proguard.g:91:47: (sourceFile= NAME )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==NAME) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Proguard.g:91:47: sourceFile= NAME
							{
							sourceFile=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag603); 
							}
							break;

					}

					}

					}
					break;
				case 9 :
					// Proguard.g:92:7: ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] )
					{
					// Proguard.g:92:7: ( '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL] )
					// Proguard.g:92:8: '-adaptclassstrings' filter[filter, FilterSeparator.GENERAL]
					{
					match(input,12,FOLLOW_12_in_ignoredFlag614); 
					List<FilterSpecification> filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_ignoredFlag618);
					filter(filter, FilterSeparator.GENERAL);
					state._fsp--;

					}

					}
					break;
				case 10 :
					// Proguard.g:93:7: ( '-applymapping' mapping= NAME )
					{
					// Proguard.g:93:7: ( '-applymapping' mapping= NAME )
					// Proguard.g:93:8: '-applymapping' mapping= NAME
					{
					match(input,16,FOLLOW_16_in_ignoredFlag629); 
					mapping=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag633); 
					}

					}
					break;
				case 11 :
					// Proguard.g:94:7: '-obfuscationdictionary' obfuscationDictionary= NAME
					{
					match(input,48,FOLLOW_48_in_ignoredFlag643); 
					obfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag647); 
					}
					break;
				case 12 :
					// Proguard.g:95:7: '-classobfuscationdictionary' classObfuscationDictionary= NAME
					{
					match(input,19,FOLLOW_19_in_ignoredFlag655); 
					classObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag659); 
					}
					break;
				case 13 :
					// Proguard.g:96:7: '-packageobfuscationdictionary' packageObfuscationDictionary= NAME
					{
					match(input,53,FOLLOW_53_in_ignoredFlag667); 
					packageObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag671); 
					}
					break;
				case 14 :
					// Proguard.g:97:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// Proguard.g:97:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// Proguard.g:97:8: '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,59,FOLLOW_59_in_ignoredFlag680); 
					// Proguard.g:97:28: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==72) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// Proguard.g:97:29: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_ignoredFlag683); 
							// Proguard.g:97:44: (newPackage= NAME )?
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==NAME) ) {
								alt4=1;
							}
							switch (alt4) {
								case 1 :
									// Proguard.g:97:44: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag687); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_ignoredFlag690); 
							}
							break;

					}

					}

					}
					break;
				case 15 :
					// Proguard.g:98:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// Proguard.g:98:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// Proguard.g:98:8: '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,30,FOLLOW_30_in_ignoredFlag703); 
					// Proguard.g:98:35: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==72) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// Proguard.g:98:36: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_ignoredFlag706); 
							// Proguard.g:98:51: (newPackage= NAME )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==NAME) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// Proguard.g:98:51: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag710); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_ignoredFlag713); 
							}
							break;

					}

					}

					}
					break;
				case 16 :
					// Proguard.g:99:7: ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] )
					{
					// Proguard.g:99:7: ( '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE] )
					// Proguard.g:99:8: '-adaptresourcefilenames' filter[file_filter, FilterSeparator.FILE]
					{
					match(input,14,FOLLOW_14_in_ignoredFlag726); 
					List<FilterSpecification> file_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_ignoredFlag730);
					filter(file_filter, FilterSeparator.FILE);
					state._fsp--;

					}

					}
					break;
				case 17 :
					// Proguard.g:100:7: ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] )
					{
					// Proguard.g:100:7: ( '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE] )
					// Proguard.g:100:8: '-adaptresourcefilecontents' filter[file_filter, FilterSeparator.FILE]
					{
					match(input,13,FOLLOW_13_in_ignoredFlag742); 
					List<FilterSpecification> file_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_ignoredFlag746);
					filter(file_filter, FilterSeparator.FILE);
					state._fsp--;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ignoredFlag"


	public static class unsupportedFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "unsupportedFlag"
	// Proguard.g:104:9: private unsupportedFlag : ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | '-forceprocessing' | ( '-printusage' NAME ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) ) ;
	public final ProguardParser.unsupportedFlag_return unsupportedFlag() throws RecognitionException {
		ProguardParser.unsupportedFlag_return retval = new ProguardParser.unsupportedFlag_return();
		retval.start = input.LT(1);

		Token outputMapping=null;
		Token seedOutputFile=null;

		try {
			// Proguard.g:105:3: ( ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | '-forceprocessing' | ( '-printusage' NAME ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) ) )
			// Proguard.g:106:3: ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | '-forceprocessing' | ( '-printusage' NAME ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) )
			{
			// Proguard.g:106:3: ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | '-forceprocessing' | ( '-printusage' NAME ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] ) )
			int alt13=11;
			switch ( input.LA(1) ) {
			case 34:
				{
				alt13=1;
				}
				break;
			case 51:
				{
				alt13=2;
				}
				break;
			case 45:
				{
				alt13=3;
				}
				break;
			case 31:
				{
				alt13=4;
				}
				break;
			case 57:
				{
				alt13=5;
				}
				break;
			case 47:
				{
				alt13=6;
				}
				break;
			case 54:
				{
				alt13=7;
				}
				break;
			case 29:
				{
				alt13=8;
				}
				break;
			case 55:
				{
				alt13=9;
				}
				break;
			case 56:
				{
				alt13=10;
				}
				break;
			case 41:
				{
				alt13=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// Proguard.g:106:5: '-injars' inJars= classpath
					{
					match(input,34,FOLLOW_34_in_unsupportedFlag772); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag776);
					classpath();
					state._fsp--;

					}
					break;
				case 2 :
					// Proguard.g:107:7: '-outjars' outJars= classpath
					{
					match(input,51,FOLLOW_51_in_unsupportedFlag784); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag788);
					classpath();
					state._fsp--;

					}
					break;
				case 3 :
					// Proguard.g:108:7: '-libraryjars' libraryJars= classpath
					{
					match(input,45,FOLLOW_45_in_unsupportedFlag796); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag800);
					classpath();
					state._fsp--;

					}
					break;
				case 4 :
					// Proguard.g:109:7: '-forceprocessing'
					{
					match(input,31,FOLLOW_31_in_unsupportedFlag808); 
					}
					break;
				case 5 :
					// Proguard.g:110:7: ( '-printusage' NAME )
					{
					// Proguard.g:110:7: ( '-printusage' NAME )
					// Proguard.g:110:8: '-printusage' NAME
					{
					match(input,57,FOLLOW_57_in_unsupportedFlag817); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag819); 
					}

					}
					break;
				case 6 :
					// Proguard.g:111:7: '-microedition'
					{
					match(input,47,FOLLOW_47_in_unsupportedFlag829); 
					}
					break;
				case 7 :
					// Proguard.g:112:7: ( '-printconfiguration' ( NAME )? )
					{
					// Proguard.g:112:7: ( '-printconfiguration' ( NAME )? )
					// Proguard.g:112:8: '-printconfiguration' ( NAME )?
					{
					match(input,54,FOLLOW_54_in_unsupportedFlag838); 
					// Proguard.g:112:30: ( NAME )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==NAME) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// Proguard.g:112:30: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag840); 
							}
							break;

					}

					}

					}
					break;
				case 8 :
					// Proguard.g:113:7: ( '-dump' ( NAME )? )
					{
					// Proguard.g:113:7: ( '-dump' ( NAME )? )
					// Proguard.g:113:8: '-dump' ( NAME )?
					{
					match(input,29,FOLLOW_29_in_unsupportedFlag852); 
					// Proguard.g:113:16: ( NAME )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==NAME) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// Proguard.g:113:16: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag854); 
							}
							break;

					}

					}

					}
					break;
				case 9 :
					// Proguard.g:114:7: '-printmapping' (outputMapping= NAME )?
					{
					match(input,55,FOLLOW_55_in_unsupportedFlag865); 
					// Proguard.g:114:36: (outputMapping= NAME )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==NAME) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// Proguard.g:114:36: outputMapping= NAME
							{
							outputMapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag869); 
							}
							break;

					}

					}
					break;
				case 10 :
					// Proguard.g:115:7: ( '-printseeds' (seedOutputFile= NAME )? )
					{
					// Proguard.g:115:7: ( '-printseeds' (seedOutputFile= NAME )? )
					// Proguard.g:115:8: '-printseeds' (seedOutputFile= NAME )?
					{
					match(input,56,FOLLOW_56_in_unsupportedFlag879); 
					// Proguard.g:115:36: (seedOutputFile= NAME )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==NAME) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// Proguard.g:115:36: seedOutputFile= NAME
							{
							seedOutputFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag883); 
							}
							break;

					}

					}

					}
					break;
				case 11 :
					// Proguard.g:116:7: ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] )
					{
					// Proguard.g:116:7: ( '-keepdirectories' filter[directory_filter, FilterSeparator.FILE] )
					// Proguard.g:116:8: '-keepdirectories' filter[directory_filter, FilterSeparator.FILE]
					{
					match(input,41,FOLLOW_41_in_unsupportedFlag895); 
					List<FilterSpecification> directory_filter = new ArrayList<FilterSpecification>();
					pushFollow(FOLLOW_filter_in_unsupportedFlag899);
					filter(directory_filter, FilterSeparator.FILE);
					state._fsp--;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsupportedFlag"



	// $ANTLR start "classpath"
	// Proguard.g:120:9: private classpath : NAME ( ( ':' | ';' ) classpath )? ;
	public final void classpath() throws RecognitionException {
		try {
			// Proguard.g:121:3: ( NAME ( ( ':' | ';' ) classpath )? )
			// Proguard.g:121:6: NAME ( ( ':' | ';' ) classpath )?
			{
			match(input,NAME,FOLLOW_NAME_in_classpath921); 
			// Proguard.g:121:11: ( ( ':' | ';' ) classpath )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= 65 && LA14_0 <= 66)) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// Proguard.g:121:12: ( ':' | ';' ) classpath
					{
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_classpath_in_classpath930);
					classpath();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classpath"



	// $ANTLR start "filter"
	// Proguard.g:124:9: private filter[List<FilterSpecification> filter, FilterSeparator separator] : ( nonEmptyFilter[filter, separator] |);
	public final void filter(List<FilterSpecification> filter, FilterSeparator separator) throws RecognitionException {
		try {
			// Proguard.g:125:3: ( nonEmptyFilter[filter, separator] |)
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= NAME && LA15_0 <= NEGATOR)) ) {
				alt15=1;
			}
			else if ( (LA15_0==EOF||(LA15_0 >= 12 && LA15_0 <= 64)||LA15_0==70) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// Proguard.g:126:3: nonEmptyFilter[filter, separator]
					{
					pushFollow(FOLLOW_nonEmptyFilter_in_filter951);
					nonEmptyFilter(filter, separator);
					state._fsp--;

					}
					break;
				case 2 :
					// Proguard.g:127:5: 
					{
					GrammarActions.filter(filter, false, "**", separator);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "filter"



	// $ANTLR start "nonEmptyFilter"
	// Proguard.g:131:9: private nonEmptyFilter[List<FilterSpecification> filter, FilterSeparator separator] : ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? ) ;
	public final void nonEmptyFilter(List<FilterSpecification> filter, FilterSeparator separator) throws RecognitionException {
		Token NAME1=null;


		  boolean negator = false;

		try {
			// Proguard.g:135:3: ( ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? ) )
			// Proguard.g:136:3: ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? )
			{
			// Proguard.g:136:3: ( ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )? )
			// Proguard.g:136:4: ( NEGATOR )? NAME ( ',' nonEmptyFilter[filter, separator] )?
			{
			// Proguard.g:136:4: ( NEGATOR )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==NEGATOR) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// Proguard.g:136:5: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_nonEmptyFilter985); 
					negator=true;
					}
					break;

			}

			NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_nonEmptyFilter991); 
			GrammarActions.filter(filter, negator, (NAME1!=null?NAME1.getText():null), separator);
			// Proguard.g:136:102: ( ',' nonEmptyFilter[filter, separator] )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==11) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Proguard.g:136:103: ',' nonEmptyFilter[filter, separator]
					{
					match(input,11,FOLLOW_11_in_nonEmptyFilter996); 
					pushFollow(FOLLOW_nonEmptyFilter_in_nonEmptyFilter998);
					nonEmptyFilter(filter, separator);
					state._fsp--;

					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nonEmptyFilter"



	// $ANTLR start "classSpecification"
	// Proguard.g:139:9: private classSpecification returns [ClassSpecification classSpec] : ( annotation )? cType= classModifierAndType[modifier] classNames (inheritanceSpec= inheritance )? ( members[classSpec] )? ;
	public final ClassSpecification classSpecification() throws RecognitionException {
		ClassSpecification classSpec = null;


		ClassTypeSpecification cType =null;
		InheritanceSpecification inheritanceSpec =null;
		List<NameSpecification> classNames2 =null;
		AnnotationSpecification annotation3 =null;


		  ModifierSpecification modifier = new ModifierSpecification();
		  boolean hasNameNegator = false;

		try {
			// Proguard.g:144:3: ( ( annotation )? cType= classModifierAndType[modifier] classNames (inheritanceSpec= inheritance )? ( members[classSpec] )? )
			// Proguard.g:145:3: ( annotation )? cType= classModifierAndType[modifier] classNames (inheritanceSpec= inheritance )? ( members[classSpec] )?
			{
			// Proguard.g:145:3: ( annotation )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==70) ) {
				int LA18_1 = input.LA(2);
				if ( ((LA18_1 >= NAME && LA18_1 <= NEGATOR)) ) {
					alt18=1;
				}
			}
			switch (alt18) {
				case 1 :
					// Proguard.g:145:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_classSpecification1028);
					annotation3=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_classModifierAndType_in_classSpecification1036);
			cType=classModifierAndType(modifier);
			state._fsp--;

			pushFollow(FOLLOW_classNames_in_classSpecification1041);
			classNames2=classNames();
			state._fsp--;

			classSpec = GrammarActions.classSpec(classNames2, cType, annotation3, modifier);
			// Proguard.g:148:3: (inheritanceSpec= inheritance )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==80||LA19_0==82) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Proguard.g:148:4: inheritanceSpec= inheritance
					{
					pushFollow(FOLLOW_inheritance_in_classSpecification1050);
					inheritanceSpec=inheritance();
					state._fsp--;

					classSpec.setInheritance(inheritanceSpec);
					}
					break;

			}

			// Proguard.g:149:3: ( members[classSpec] )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==95) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Proguard.g:149:3: members[classSpec]
					{
					pushFollow(FOLLOW_members_in_classSpecification1058);
					members(classSpec);
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return classSpec;
	}
	// $ANTLR end "classSpecification"



	// $ANTLR start "classNames"
	// Proguard.g:152:9: private classNames returns [List<NameSpecification> names] : firstName= className ( ',' otherName= className )* ;
	public final List<NameSpecification> classNames() throws RecognitionException {
		List<NameSpecification> names = null;


		NameSpecification firstName =null;
		NameSpecification otherName =null;


		  names = new ArrayList<NameSpecification>();

		try {
			// Proguard.g:156:3: (firstName= className ( ',' otherName= className )* )
			// Proguard.g:157:3: firstName= className ( ',' otherName= className )*
			{
			pushFollow(FOLLOW_className_in_classNames1087);
			firstName=className();
			state._fsp--;

			names.add(firstName);
			// Proguard.g:158:3: ( ',' otherName= className )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==11) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Proguard.g:158:4: ',' otherName= className
					{
					match(input,11,FOLLOW_11_in_classNames1094); 
					pushFollow(FOLLOW_className_in_classNames1098);
					otherName=className();
					state._fsp--;

					names.add(otherName);
					}
					break;

				default :
					break loop21;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return names;
	}
	// $ANTLR end "classNames"



	// $ANTLR start "className"
	// Proguard.g:161:9: private className returns [NameSpecification nameSpec] : ( NEGATOR )? NAME ;
	public final NameSpecification className() throws RecognitionException {
		NameSpecification nameSpec = null;


		Token NAME4=null;


		    boolean hasNameNegator = false;

		try {
			// Proguard.g:165:3: ( ( NEGATOR )? NAME )
			// Proguard.g:166:3: ( NEGATOR )? NAME
			{
			// Proguard.g:166:3: ( NEGATOR )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NEGATOR) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Proguard.g:166:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_className1127); 
					hasNameNegator = true;
					}
					break;

			}

			NAME4=(Token)match(input,NAME,FOLLOW_NAME_in_className1135); 
			nameSpec=GrammarActions.className((NAME4!=null?NAME4.getText():null), hasNameNegator);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nameSpec;
	}
	// $ANTLR end "className"



	// $ANTLR start "classModifierAndType"
	// Proguard.g:170:9: private classModifierAndType[ModifierSpecification modifier] returns [ClassTypeSpecification cType] : ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) ;
	public final ClassTypeSpecification classModifierAndType(ModifierSpecification modifier) throws RecognitionException {
		ClassTypeSpecification cType = null;


		ClassTypeSpecification cmat =null;
		int classType5 =0;


		  boolean hasNegator = false;

		try {
			// Proguard.g:174:3: ( ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) )
			// Proguard.g:175:3: ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			{
			// Proguard.g:175:3: ( NEGATOR )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NEGATOR) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Proguard.g:175:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classModifierAndType1162); 
					hasNegator = true;
					}
					break;

			}

			// Proguard.g:176:3: ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			int alt24=4;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt24=1;
				}
				break;
			case 73:
				{
				alt24=2;
				}
				break;
			case 81:
				{
				alt24=3;
				}
				break;
			case 70:
			case 78:
			case 79:
			case 83:
				{
				alt24=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// Proguard.g:177:3: 'public' cmat= classModifierAndType[modifier]
					{
					match(input,87,FOLLOW_87_in_classModifierAndType1174); 
					GrammarActions.addAccessFlag(modifier, AccessFlag.PUBLIC, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1180);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 2 :
					// Proguard.g:178:5: 'abstract' cmat= classModifierAndType[modifier]
					{
					match(input,73,FOLLOW_73_in_classModifierAndType1189); 
					GrammarActions.addModifier(modifier, Modifier.ABSTRACT, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1195);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 3 :
					// Proguard.g:179:5: 'final' cmat= classModifierAndType[modifier]
					{
					match(input,81,FOLLOW_81_in_classModifierAndType1204); 
					GrammarActions.addModifier(modifier, Modifier.FINAL, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1210);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 4 :
					// Proguard.g:180:5: classType
					{
					pushFollow(FOLLOW_classType_in_classModifierAndType1219);
					classType5=classType();
					state._fsp--;

					cType=GrammarActions.classType(classType5, hasNegator); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return cType;
	}
	// $ANTLR end "classModifierAndType"



	// $ANTLR start "classType"
	// Proguard.g:184:9: private classType returns [int type] : ( '@' )? ( 'interface' | 'enum' | 'class' ) ;
	public final int classType() throws RecognitionException {
		int type = 0;



		  type = 0;

		try {
			// Proguard.g:188:3: ( ( '@' )? ( 'interface' | 'enum' | 'class' ) )
			// Proguard.g:189:3: ( '@' )? ( 'interface' | 'enum' | 'class' )
			{
			// Proguard.g:189:3: ( '@' )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==70) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Proguard.g:189:4: '@'
					{
					match(input,70,FOLLOW_70_in_classType1252); 
					type |= ACC_ANNOTATION;
					}
					break;

			}

			// Proguard.g:190:3: ( 'interface' | 'enum' | 'class' )
			int alt26=3;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt26=1;
				}
				break;
			case 79:
				{
				alt26=2;
				}
				break;
			case 78:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// Proguard.g:190:4: 'interface'
					{
					match(input,83,FOLLOW_83_in_classType1261); 
					type |= ACC_INTERFACE;
					}
					break;
				case 2 :
					// Proguard.g:191:5: 'enum'
					{
					match(input,79,FOLLOW_79_in_classType1269); 
					type |= ACC_ENUM;
					}
					break;
				case 3 :
					// Proguard.g:192:5: 'class'
					{
					match(input,78,FOLLOW_78_in_classType1277); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "classType"



	// $ANTLR start "members"
	// Proguard.g:196:9: private members[ClassSpecification classSpec] : '{' ( member[classSpec] )* '}' ;
	public final void members(ClassSpecification classSpec) throws RecognitionException {
		try {
			// Proguard.g:197:3: ( '{' ( member[classSpec] )* '}' )
			// Proguard.g:198:3: '{' ( member[classSpec] )* '}'
			{
			match(input,95,FOLLOW_95_in_members1300); 
			// Proguard.g:199:5: ( member[classSpec] )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= NAME && LA27_0 <= NEGATOR)||LA27_0==8||(LA27_0 >= 67 && LA27_0 <= 70)||LA27_0==73||LA27_0==77||LA27_0==81||(LA27_0 >= 84 && LA27_0 <= 94)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// Proguard.g:199:5: member[classSpec]
					{
					pushFollow(FOLLOW_member_in_members1306);
					member(classSpec);
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			match(input,96,FOLLOW_96_in_members1312); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "members"



	// $ANTLR start "member"
	// Proguard.g:203:9: private member[ClassSpecification classSpec] : ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' ;
	public final void member(ClassSpecification classSpec) throws RecognitionException {
		Token name=null;
		String typeSig =null;
		String signature =null;
		AnnotationSpecification annotation6 =null;
		ModifierSpecification modifiers7 =null;

		try {
			// Proguard.g:204:3: ( ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' )
			// Proguard.g:205:5: ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';'
			{
			// Proguard.g:205:5: ( annotation )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==70) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Proguard.g:205:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_member1333);
					annotation6=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_modifiers_in_member1336);
			modifiers7=modifiers();
			state._fsp--;

			// Proguard.g:206:5: ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' )
			int alt31=3;
			switch ( input.LA(1) ) {
			case NAME:
			case 8:
			case 68:
				{
				alt31=1;
				}
				break;
			case 69:
				{
				alt31=2;
				}
				break;
			case 67:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// Proguard.g:207:7: (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |)
					{
					// Proguard.g:207:7: (typeSig= type )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==NAME) ) {
						int LA29_1 = input.LA(2);
						if ( (LA29_1==NAME||LA29_1==68||LA29_1==71) ) {
							alt29=1;
						}
					}
					else if ( (LA29_0==8) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// Proguard.g:207:8: typeSig= type
							{
							pushFollow(FOLLOW_type_in_member1353);
							typeSig=type();
							state._fsp--;

							}
							break;

					}

					name=input.LT(1);
					if ( input.LA(1)==NAME||input.LA(1)==68 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// Proguard.g:207:44: (signature= arguments |)
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==9) ) {
						alt30=1;
					}
					else if ( (LA30_0==66) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// Proguard.g:207:45: signature= arguments
							{
							pushFollow(FOLLOW_arguments_in_member1368);
							signature=arguments();
							state._fsp--;

							GrammarActions.method(classSpec, annotation6, typeSig, (name!=null?name.getText():null), signature, modifiers7);
							}
							break;
						case 2 :
							// Proguard.g:208:21: 
							{
							GrammarActions.fieldOrAnyMember(classSpec, annotation6, typeSig, (name!=null?name.getText():null), modifiers7);
							}
							break;

					}

					}
					break;
				case 2 :
					// Proguard.g:209:9: '<methods>'
					{
					match(input,69,FOLLOW_69_in_member1403); 
					GrammarActions.method(classSpec, annotation6,
					          GrammarActions.getSignature("***", 0), "*", "\\("+ GrammarActions.getSignature("...", 0) + "\\)",
					          modifiers7);
					}
					break;
				case 3 :
					// Proguard.g:212:9: '<fields>'
					{
					match(input,67,FOLLOW_67_in_member1415); 
					GrammarActions.field(classSpec, annotation6, null, "*", modifiers7);
					}
					break;

			}

			match(input,66,FOLLOW_66_in_member1425); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "member"



	// $ANTLR start "annotation"
	// Proguard.g:216:9: private annotation returns [AnnotationSpecification annotSpec] : '@' ( NEGATOR )? NAME ;
	public final AnnotationSpecification annotation() throws RecognitionException {
		AnnotationSpecification annotSpec = null;


		Token NAME8=null;


		  boolean hasNameNegator = false;

		try {
			// Proguard.g:220:3: ( '@' ( NEGATOR )? NAME )
			// Proguard.g:220:6: '@' ( NEGATOR )? NAME
			{
			match(input,70,FOLLOW_70_in_annotation1449); 
			// Proguard.g:220:10: ( NEGATOR )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==NEGATOR) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// Proguard.g:220:11: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_annotation1452); 
					hasNameNegator = true;
					}
					break;

			}

			NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_annotation1458); 
			annotSpec = GrammarActions.annotation((NAME8!=null?NAME8.getText():null), hasNameNegator);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return annotSpec;
	}
	// $ANTLR end "annotation"



	// $ANTLR start "modifiers"
	// Proguard.g:222:9: private modifiers returns [ModifierSpecification modifiers] : ( modifier[modifiers] )* ;
	public final ModifierSpecification modifiers() throws RecognitionException {
		ModifierSpecification modifiers = null;



		  modifiers = new ModifierSpecification();

		try {
			// Proguard.g:226:3: ( ( modifier[modifiers] )* )
			// Proguard.g:227:3: ( modifier[modifiers] )*
			{
			// Proguard.g:227:3: ( modifier[modifiers] )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==NEGATOR||LA33_0==73||LA33_0==77||LA33_0==81||(LA33_0 >= 84 && LA33_0 <= 94)) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// Proguard.g:227:3: modifier[modifiers]
					{
					pushFollow(FOLLOW_modifier_in_modifiers1482);
					modifier(modifiers);
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifiers;
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "modifier"
	// Proguard.g:230:9: private modifier[ModifierSpecification modifiers] : ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) ;
	public final void modifier(ModifierSpecification modifiers) throws RecognitionException {

		  boolean hasNegator = false;

		try {
			// Proguard.g:234:3: ( ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) )
			// Proguard.g:235:3: ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			{
			// Proguard.g:235:3: ( NEGATOR )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==NEGATOR) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Proguard.g:235:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_modifier1508); 
					hasNegator = true;
					}
					break;

			}

			// Proguard.g:236:3: ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			int alt35=14;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt35=1;
				}
				break;
			case 85:
				{
				alt35=2;
				}
				break;
			case 86:
				{
				alt35=3;
				}
				break;
			case 88:
				{
				alt35=4;
				}
				break;
			case 90:
				{
				alt35=5;
				}
				break;
			case 94:
				{
				alt35=6;
				}
				break;
			case 84:
				{
				alt35=7;
				}
				break;
			case 73:
				{
				alt35=8;
				}
				break;
			case 89:
				{
				alt35=9;
				}
				break;
			case 81:
				{
				alt35=10;
				}
				break;
			case 92:
				{
				alt35=11;
				}
				break;
			case 91:
				{
				alt35=12;
				}
				break;
			case 77:
				{
				alt35=13;
				}
				break;
			case 93:
				{
				alt35=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// Proguard.g:237:5: 'public'
					{
					match(input,87,FOLLOW_87_in_modifier1522); 
					modifiers.addAccessFlag(AccessFlag.PUBLIC, hasNegator);
					}
					break;
				case 2 :
					// Proguard.g:238:7: 'private'
					{
					match(input,85,FOLLOW_85_in_modifier1532); 
					modifiers.addAccessFlag(AccessFlag.PRIVATE, hasNegator);
					}
					break;
				case 3 :
					// Proguard.g:239:7: 'protected'
					{
					match(input,86,FOLLOW_86_in_modifier1542); 
					modifiers.addAccessFlag(AccessFlag.PROTECTED, hasNegator);
					}
					break;
				case 4 :
					// Proguard.g:240:7: 'static'
					{
					match(input,88,FOLLOW_88_in_modifier1552); 
					modifiers.addModifier(Modifier.STATIC, hasNegator);
					}
					break;
				case 5 :
					// Proguard.g:241:7: 'synchronized'
					{
					match(input,90,FOLLOW_90_in_modifier1562); 
					modifiers.addModifier(Modifier.SYNCHRONIZED, hasNegator);
					}
					break;
				case 6 :
					// Proguard.g:242:7: 'volatile'
					{
					match(input,94,FOLLOW_94_in_modifier1572); 
					modifiers.addModifier(Modifier.VOLATILE, hasNegator);
					}
					break;
				case 7 :
					// Proguard.g:243:7: 'native'
					{
					match(input,84,FOLLOW_84_in_modifier1582); 
					modifiers.addModifier(Modifier.NATIVE, hasNegator);
					}
					break;
				case 8 :
					// Proguard.g:244:7: 'abstract'
					{
					match(input,73,FOLLOW_73_in_modifier1592); 
					modifiers.addModifier(Modifier.ABSTRACT, hasNegator);
					}
					break;
				case 9 :
					// Proguard.g:245:7: 'strictfp'
					{
					match(input,89,FOLLOW_89_in_modifier1602); 
					modifiers.addModifier(Modifier.STRICTFP, hasNegator);
					}
					break;
				case 10 :
					// Proguard.g:246:7: 'final'
					{
					match(input,81,FOLLOW_81_in_modifier1612); 
					modifiers.addModifier(Modifier.FINAL, hasNegator);
					}
					break;
				case 11 :
					// Proguard.g:247:7: 'transient'
					{
					match(input,92,FOLLOW_92_in_modifier1622); 
					modifiers.addModifier(Modifier.TRANSIENT, hasNegator);
					}
					break;
				case 12 :
					// Proguard.g:248:7: 'synthetic'
					{
					match(input,91,FOLLOW_91_in_modifier1632); 
					modifiers.addModifier(Modifier.SYNTHETIC, hasNegator);
					}
					break;
				case 13 :
					// Proguard.g:249:7: 'bridge'
					{
					match(input,77,FOLLOW_77_in_modifier1642); 
					modifiers.addModifier(Modifier.BRIDGE, hasNegator);
					}
					break;
				case 14 :
					// Proguard.g:250:7: 'varargs'
					{
					match(input,93,FOLLOW_93_in_modifier1652); 
					modifiers.addModifier(Modifier.VARARGS, hasNegator);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "modifier"



	// $ANTLR start "inheritance"
	// Proguard.g:254:9: private inheritance returns [InheritanceSpecification inheritanceSpec] : ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME ;
	public final InheritanceSpecification inheritance() throws RecognitionException {
		InheritanceSpecification inheritanceSpec = null;


		Token NAME9=null;
		AnnotationSpecification annotation10 =null;


		  boolean hasNameNegator = false;

		try {
			// Proguard.g:258:3: ( ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME )
			// Proguard.g:259:3: ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME
			{
			if ( input.LA(1)==80||input.LA(1)==82 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Proguard.g:260:3: ( annotation )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==70) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Proguard.g:260:3: annotation
					{
					pushFollow(FOLLOW_annotation_in_inheritance1693);
					annotation10=annotation();
					state._fsp--;

					}
					break;

			}

			// Proguard.g:260:15: ( NEGATOR )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==NEGATOR) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// Proguard.g:260:16: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_inheritance1697); 
					hasNameNegator = true;
					}
					break;

			}

			NAME9=(Token)match(input,NAME,FOLLOW_NAME_in_inheritance1703); 
			inheritanceSpec = GrammarActions.createInheritance((NAME9!=null?NAME9.getText():null), hasNameNegator, annotation10);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return inheritanceSpec;
	}
	// $ANTLR end "inheritance"



	// $ANTLR start "arguments"
	// Proguard.g:262:9: private arguments returns [String signature] : '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' ;
	public final String arguments() throws RecognitionException {
		String signature = null;


		String parameterSig =null;

		try {
			// Proguard.g:263:3: ( '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' )
			// Proguard.g:264:3: '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')'
			{
			match(input,9,FOLLOW_9_in_arguments1723); 
			signature = "\\(";
			// Proguard.g:265:5: ( (parameterSig= type ( ',' parameterSig= type )* )? )
			// Proguard.g:266:7: (parameterSig= type ( ',' parameterSig= type )* )?
			{
			// Proguard.g:266:7: (parameterSig= type ( ',' parameterSig= type )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==NAME||LA39_0==8) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Proguard.g:267:9: parameterSig= type ( ',' parameterSig= type )*
					{
					pushFollow(FOLLOW_type_in_arguments1751);
					parameterSig=type();
					state._fsp--;

					signature += parameterSig;
					// Proguard.g:268:9: ( ',' parameterSig= type )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==11) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// Proguard.g:268:10: ',' parameterSig= type
							{
							match(input,11,FOLLOW_11_in_arguments1764); 
							pushFollow(FOLLOW_type_in_arguments1768);
							parameterSig=type();
							state._fsp--;

							signature += parameterSig;
							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			}

			match(input,10,FOLLOW_10_in_arguments1797); 
			signature += "\\)";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return signature;
	}
	// $ANTLR end "arguments"



	// $ANTLR start "type"
	// Proguard.g:274:9: private type returns [String signature] : (typeName= ( '%' | NAME ) ( '[]' )* ) ;
	public final String type() throws RecognitionException {
		String signature = null;


		Token typeName=null;


		  int dim = 0;

		try {
			// Proguard.g:278:3: ( (typeName= ( '%' | NAME ) ( '[]' )* ) )
			// Proguard.g:279:3: (typeName= ( '%' | NAME ) ( '[]' )* )
			{
			// Proguard.g:279:3: (typeName= ( '%' | NAME ) ( '[]' )* )
			// Proguard.g:280:5: typeName= ( '%' | NAME ) ( '[]' )*
			{
			typeName=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==8 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Proguard.g:280:27: ( '[]' )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==71) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// Proguard.g:280:28: '[]'
					{
					match(input,71,FOLLOW_71_in_type1842); 
					dim++;
					}
					break;

				default :
					break loop40;
				}
			}

			String sig = (typeName!=null?typeName.getText():null); signature = GrammarActions.getSignature(sig == null ? "" : sig, dim);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return signature;
	}
	// $ANTLR end "type"



	// $ANTLR start "keepOptionModifier"
	// Proguard.g:284:9: private keepOptionModifier returns [KeepModifier modifier] : ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )* ;
	public final KeepModifier keepOptionModifier() throws RecognitionException {
		KeepModifier modifier = null;



		  modifier = new KeepModifier();

		try {
			// Proguard.g:288:3: ( ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )* )
			// Proguard.g:288:5: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )*
			{
			// Proguard.g:288:5: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==11) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// Proguard.g:288:6: ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
					{
					match(input,11,FOLLOW_11_in_keepOptionModifier1877); 
					// Proguard.g:289:3: ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
					int alt41=3;
					switch ( input.LA(1) ) {
					case 76:
						{
						alt41=1;
						}
						break;
					case 75:
						{
						alt41=2;
						}
						break;
					case 74:
						{
						alt41=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}
					switch (alt41) {
						case 1 :
							// Proguard.g:289:4: 'allowshrinking'
							{
							match(input,76,FOLLOW_76_in_keepOptionModifier1882); 
							modifier.setAllowShrinking();
							}
							break;
						case 2 :
							// Proguard.g:290:5: 'allowoptimization'
							{
							match(input,75,FOLLOW_75_in_keepOptionModifier1890); 
							}
							break;
						case 3 :
							// Proguard.g:291:5: 'allowobfuscation'
							{
							match(input,74,FOLLOW_74_in_keepOptionModifier1897); 
							modifier.setAllowObfuscation();
							}
							break;

					}

					}
					break;

				default :
					break loop42;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifier;
	}
	// $ANTLR end "keepOptionModifier"

	// Delegated rules



	public static final BitSet FOLLOW_18_in_prog81 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog85 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_set_in_prog96 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog104 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_40_in_prog115 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog119 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog123 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_38_in_prog135 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog139 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog143 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_35_in_prog155 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog159 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog163 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_ignoredFlag_in_prog177 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_noOpFlag_in_prog191 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_unsupportedFlag_in_prog205 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_28_in_prog217 = new BitSet(new long[]{0xFFFFFFFFFFFFF060L,0x0000000000000041L});
	public static final BitSet FOLLOW_filter_in_prog221 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_32_in_prog234 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_61_in_prog246 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog250 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_64_in_prog262 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog266 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_24_in_prog278 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_22_in_prog291 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_21_in_prog304 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_EOF_in_prog316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_noOpFlag345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_noOpFlag354 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_noOpFlag373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_noOpFlag381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_noOpFlag389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_noOpFlag397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_noOpFlag410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_noOpFlag419 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_noOpFlag434 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_noOpFlag450 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_noOpFlag466 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_noOpFlag482 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_noOpFlag498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ignoredFlag527 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ignoredFlag541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ignoredFlag549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_ignoredFlag558 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ignoredFlag571 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_ignoredFlag573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ignoredFlag582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ignoredFlag590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ignoredFlag599 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_ignoredFlag614 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ignoredFlag629 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_ignoredFlag643 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ignoredFlag655 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_ignoredFlag667 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ignoredFlag680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag683 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_ignoredFlag703 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag706 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ignoredFlag726 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_ignoredFlag742 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_unsupportedFlag772 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unsupportedFlag784 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_unsupportedFlag796 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_unsupportedFlag808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unsupportedFlag817 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_unsupportedFlag829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unsupportedFlag838 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_unsupportedFlag852 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unsupportedFlag865 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_unsupportedFlag879 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unsupportedFlag895 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_classpath921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_classpath924 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_classpath930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonEmptyFilter_in_filter951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_nonEmptyFilter985 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_nonEmptyFilter991 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_nonEmptyFilter996 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_nonEmptyFilter_in_nonEmptyFilter998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_classSpecification1028 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classSpecification1036 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_classNames_in_classSpecification1041 = new BitSet(new long[]{0x0000000000000002L,0x0000000080050000L});
	public static final BitSet FOLLOW_inheritance_in_classSpecification1050 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_members_in_classSpecification1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_classNames1087 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_classNames1094 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_className_in_classNames1098 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_NEGATOR_in_className1127 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_className1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_classModifierAndType1162 = new BitSet(new long[]{0x0000000000000000L,0x00000000008AC240L});
	public static final BitSet FOLLOW_87_in_classModifierAndType1174 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_classModifierAndType1189 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_classModifierAndType1204 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classType_in_classModifierAndType1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_classType1252 = new BitSet(new long[]{0x0000000000000000L,0x000000000008C000L});
	public static final BitSet FOLLOW_83_in_classType1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_classType1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_classType1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_members1300 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_member_in_members1306 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_96_in_members1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_member1333 = new BitSet(new long[]{0x0000000000000160L,0x000000007FF22238L});
	public static final BitSet FOLLOW_modifiers_in_member1336 = new BitSet(new long[]{0x0000000000000120L,0x0000000000000038L});
	public static final BitSet FOLLOW_type_in_member1353 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_member1359 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
	public static final BitSet FOLLOW_arguments_in_member1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_69_in_member1403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_67_in_member1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_member1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_annotation1449 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_annotation1452 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_annotation1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers1482 = new BitSet(new long[]{0x0000000000000042L,0x000000007FF22200L});
	public static final BitSet FOLLOW_NEGATOR_in_modifier1508 = new BitSet(new long[]{0x0000000000000000L,0x000000007FF22200L});
	public static final BitSet FOLLOW_87_in_modifier1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_modifier1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_modifier1552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier1562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_modifier1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_modifier1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_modifier1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_modifier1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_modifier1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_modifier1652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inheritance1683 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000040L});
	public static final BitSet FOLLOW_annotation_in_inheritance1693 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_inheritance1697 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_inheritance1703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_arguments1723 = new BitSet(new long[]{0x0000000000000520L});
	public static final BitSet FOLLOW_type_in_arguments1751 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_11_in_arguments1764 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_type_in_arguments1768 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_10_in_arguments1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_type1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_type1842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_11_in_keepOptionModifier1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
	public static final BitSet FOLLOW_76_in_keepOptionModifier1882 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_75_in_keepOptionModifier1890 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_74_in_keepOptionModifier1897 = new BitSet(new long[]{0x0000000000000802L});
}
