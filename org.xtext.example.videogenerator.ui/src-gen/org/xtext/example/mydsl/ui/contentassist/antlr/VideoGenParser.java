/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.VideoGenGrammarAccess;

public class VideoGenParser extends AbstractContentAssistParser {
	
	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVideoGenParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVideoGenParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVideoGenParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVideoSeqAccess().getAlternatives(), "rule__VideoSeq__Alternatives");
					put(grammarAccess.getFilterAccess().getAlternatives(), "rule__Filter__Alternatives");
					put(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0(), "rule__FlipFilter__OrientationAlternatives_1_0");
					put(grammarAccess.getVideoGeneratorModelAccess().getGroup(), "rule__VideoGeneratorModel__Group__0");
					put(grammarAccess.getVideoGenInformationAccess().getGroup(), "rule__VideoGenInformation__Group__0");
					put(grammarAccess.getVideoGenInformationAccess().getGroup_1(), "rule__VideoGenInformation__Group_1__0");
					put(grammarAccess.getVideoGenInformationAccess().getGroup_2(), "rule__VideoGenInformation__Group_2__0");
					put(grammarAccess.getVideoGenInformationAccess().getGroup_3(), "rule__VideoGenInformation__Group_3__0");
					put(grammarAccess.getMandatoryVideoSeqAccess().getGroup(), "rule__MandatoryVideoSeq__Group__0");
					put(grammarAccess.getOptionalVideoSeqAccess().getGroup(), "rule__OptionalVideoSeq__Group__0");
					put(grammarAccess.getAlternativeVideoSeqAccess().getGroup(), "rule__AlternativeVideoSeq__Group__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup(), "rule__VideoDescription__Group__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup_3(), "rule__VideoDescription__Group_3__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup_3_1(), "rule__VideoDescription__Group_3_1__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup_3_2(), "rule__VideoDescription__Group_3_2__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup_3_3(), "rule__VideoDescription__Group_3_3__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup_3_4(), "rule__VideoDescription__Group_3_4__0");
					put(grammarAccess.getVideoDescriptionAccess().getGroup_3_5(), "rule__VideoDescription__Group_3_5__0");
					put(grammarAccess.getBlackWhiteFilterAccess().getGroup(), "rule__BlackWhiteFilter__Group__0");
					put(grammarAccess.getNegateFilterAccess().getGroup(), "rule__NegateFilter__Group__0");
					put(grammarAccess.getFlipFilterAccess().getGroup(), "rule__FlipFilter__Group__0");
					put(grammarAccess.getVideoGeneratorModelAccess().getInformationAssignment_1(), "rule__VideoGeneratorModel__InformationAssignment_1");
					put(grammarAccess.getVideoGeneratorModelAccess().getVideoseqsAssignment_4(), "rule__VideoGeneratorModel__VideoseqsAssignment_4");
					put(grammarAccess.getVideoGenInformationAccess().getAuthorNameAssignment_1_1(), "rule__VideoGenInformation__AuthorNameAssignment_1_1");
					put(grammarAccess.getVideoGenInformationAccess().getVersionAssignment_2_1(), "rule__VideoGenInformation__VersionAssignment_2_1");
					put(grammarAccess.getVideoGenInformationAccess().getCreationDateAssignment_3_1(), "rule__VideoGenInformation__CreationDateAssignment_3_1");
					put(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionAssignment_1(), "rule__MandatoryVideoSeq__DescriptionAssignment_1");
					put(grammarAccess.getOptionalVideoSeqAccess().getDescriptionAssignment_1(), "rule__OptionalVideoSeq__DescriptionAssignment_1");
					put(grammarAccess.getAlternativeVideoSeqAccess().getVideoidAssignment_1(), "rule__AlternativeVideoSeq__VideoidAssignment_1");
					put(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsAssignment_3(), "rule__AlternativeVideoSeq__VideodescsAssignment_3");
					put(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1(), "rule__VideoDescription__VideoidAssignment_1");
					put(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2(), "rule__VideoDescription__LocationAssignment_2");
					put(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1(), "rule__VideoDescription__DurationAssignment_3_1_1");
					put(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1(), "rule__VideoDescription__ProbabilityAssignment_3_2_1");
					put(grammarAccess.getVideoDescriptionAccess().getSizeAssignment_3_3_1(), "rule__VideoDescription__SizeAssignment_3_3_1");
					put(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_4_1(), "rule__VideoDescription__DescriptionAssignment_3_4_1");
					put(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_5_1(), "rule__VideoDescription__FilterAssignment_3_5_1");
					put(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1(), "rule__FlipFilter__OrientationAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVideoGenParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVideoGenParser) parser;
			typedParser.entryRuleVideoGeneratorModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VideoGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
