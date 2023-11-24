/*
 * Copyright (c) 2023 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.element.android.compound.tokens

import io.element.android.compound.annotations.CoreColorToken
import io.element.android.compound.tokens.generated.SemanticColors
import io.element.android.compound.tokens.generated.internal.DarkColorTokens
import io.element.android.compound.tokens.generated.internal.LightColorTokens

@OptIn(CoreColorToken::class)
internal val compoundColorsLight = SemanticColors(
    textPrimary = LightColorTokens.colorGray1400,
    textSecondary = LightColorTokens.colorGray900,
    textPlaceholder = LightColorTokens.colorGray800,
    textDisabled = LightColorTokens.colorGray800,
    textActionPrimary = LightColorTokens.colorGray1400,
    textActionAccent = LightColorTokens.colorGreen900,
    textLinkExternal = LightColorTokens.colorBlue900,
    textCriticalPrimary = LightColorTokens.colorRed900,
    textSuccessPrimary = LightColorTokens.colorGreen900,
    textInfoPrimary = LightColorTokens.colorBlue900,
    textOnSolidPrimary = LightColorTokens.colorThemeBg,
    bgSubtlePrimary = LightColorTokens.colorGray400,
    bgSubtleSecondary = LightColorTokens.colorBgSubtleSecondaryLevel0,
    bgCanvasDefault = LightColorTokens.colorThemeBg,
    bgCanvasDisabled = LightColorTokens.colorGray200,
    bgActionPrimaryRest = LightColorTokens.colorGray1400,
    bgActionPrimaryHovered = LightColorTokens.colorGray1200,
    bgActionPrimaryPressed = LightColorTokens.colorGray1100,
    bgActionPrimaryDisabled = LightColorTokens.colorGray700,
    bgActionSecondaryRest = LightColorTokens.colorThemeBg,
    bgActionSecondaryHovered = LightColorTokens.colorAlphaGray200,
    bgActionSecondaryPressed = LightColorTokens.colorAlphaGray300,
    bgCriticalPrimary = LightColorTokens.colorRed900,
    bgCriticalHovered = LightColorTokens.colorRed1000,
    bgCriticalSubtle = LightColorTokens.colorRed200,
    bgCriticalSubtleHovered = LightColorTokens.colorRed300,
    bgSuccessSubtle = LightColorTokens.colorGreen200,
    bgInfoSubtle = LightColorTokens.colorBlue200,
    borderDisabled = LightColorTokens.colorGray500,
    borderFocused = LightColorTokens.colorBlue900,
    borderInteractivePrimary = LightColorTokens.colorGray800,
    borderInteractiveSecondary = LightColorTokens.colorGray600,
    borderInteractiveHovered = LightColorTokens.colorGray1100,
    borderCriticalPrimary = LightColorTokens.colorRed900,
    borderCriticalHovered = LightColorTokens.colorRed1000,
    borderCriticalSubtle = LightColorTokens.colorRed500,
    borderSuccessSubtle = LightColorTokens.colorGreen500,
    borderInfoSubtle = LightColorTokens.colorBlue500,
    iconPrimary = LightColorTokens.colorGray1400,
    iconSecondary = LightColorTokens.colorGray900,
    iconTertiary = LightColorTokens.colorGray800,
    iconQuaternary = LightColorTokens.colorGray700,
    iconDisabled = LightColorTokens.colorGray700,
    iconPrimaryAlpha = LightColorTokens.colorAlphaGray1400,
    iconSecondaryAlpha = LightColorTokens.colorAlphaGray900,
    iconTertiaryAlpha = LightColorTokens.colorAlphaGray800,
    iconQuaternaryAlpha = LightColorTokens.colorAlphaGray700,
    iconAccentTertiary = LightColorTokens.colorGreen800,
    iconCriticalPrimary = LightColorTokens.colorRed900,
    iconSuccessPrimary = LightColorTokens.colorGreen900,
    iconInfoPrimary = LightColorTokens.colorBlue900,
    iconOnSolidPrimary = LightColorTokens.colorThemeBg,
    isLight = true,
)

@OptIn(CoreColorToken::class)
internal val compoundColorsDark = SemanticColors(
    textPrimary = DarkColorTokens.colorGray1400,
    textSecondary = DarkColorTokens.colorGray900,
    textPlaceholder = DarkColorTokens.colorGray800,
    textDisabled = DarkColorTokens.colorGray800,
    textActionPrimary = DarkColorTokens.colorGray1400,
    textActionAccent = DarkColorTokens.colorGreen900,
    textLinkExternal = DarkColorTokens.colorBlue900,
    textCriticalPrimary = DarkColorTokens.colorRed900,
    textSuccessPrimary = DarkColorTokens.colorGreen900,
    textInfoPrimary = DarkColorTokens.colorBlue900,
    textOnSolidPrimary = DarkColorTokens.colorThemeBg,
    bgSubtlePrimary = DarkColorTokens.colorGray400,
    // The value DarkColorTokens.colorBgSubtleSecondaryLevel0 is defined to colorThemeBg, this is not correct, so override the value here until this is fixed,
    bgSubtleSecondary =  DarkColorTokens.colorGray300, // DarkColorTokens.colorBgSubtleSecondaryLevel0
    bgCanvasDefault = DarkColorTokens.colorThemeBg,
    bgCanvasDisabled = DarkColorTokens.colorGray200,
    bgActionPrimaryRest = DarkColorTokens.colorGray1400,
    bgActionPrimaryHovered = DarkColorTokens.colorGray1200,
    bgActionPrimaryPressed = DarkColorTokens.colorGray1100,
    bgActionPrimaryDisabled = DarkColorTokens.colorGray700,
    bgActionSecondaryRest = DarkColorTokens.colorThemeBg,
    bgActionSecondaryHovered = DarkColorTokens.colorAlphaGray200,
    bgActionSecondaryPressed = DarkColorTokens.colorAlphaGray300,
    bgCriticalPrimary = DarkColorTokens.colorRed900,
    bgCriticalHovered = DarkColorTokens.colorRed1000,
    bgCriticalSubtle = DarkColorTokens.colorRed200,
    bgCriticalSubtleHovered = DarkColorTokens.colorRed300,
    bgSuccessSubtle = DarkColorTokens.colorGreen200,
    bgInfoSubtle = DarkColorTokens.colorBlue200,
    borderDisabled = DarkColorTokens.colorGray500,
    borderFocused = DarkColorTokens.colorBlue900,
    borderInteractivePrimary = DarkColorTokens.colorGray800,
    borderInteractiveSecondary = DarkColorTokens.colorGray600,
    borderInteractiveHovered = DarkColorTokens.colorGray1100,
    borderCriticalPrimary = DarkColorTokens.colorRed900,
    borderCriticalHovered = DarkColorTokens.colorRed1000,
    borderCriticalSubtle = DarkColorTokens.colorRed500,
    borderSuccessSubtle = DarkColorTokens.colorGreen500,
    borderInfoSubtle = DarkColorTokens.colorBlue500,
    iconPrimary = DarkColorTokens.colorGray1400,
    iconSecondary = DarkColorTokens.colorGray900,
    iconTertiary = DarkColorTokens.colorGray800,
    iconQuaternary = DarkColorTokens.colorGray700,
    iconDisabled = DarkColorTokens.colorGray700,
    iconPrimaryAlpha = DarkColorTokens.colorAlphaGray1400,
    iconSecondaryAlpha = DarkColorTokens.colorAlphaGray900,
    iconTertiaryAlpha = DarkColorTokens.colorAlphaGray800,
    iconQuaternaryAlpha = DarkColorTokens.colorAlphaGray700,
    iconAccentTertiary = DarkColorTokens.colorGreen800,
    iconCriticalPrimary = DarkColorTokens.colorRed900,
    iconSuccessPrimary = DarkColorTokens.colorGreen900,
    iconInfoPrimary = DarkColorTokens.colorBlue900,
    iconOnSolidPrimary = DarkColorTokens.colorThemeBg,
    isLight = false,
)
