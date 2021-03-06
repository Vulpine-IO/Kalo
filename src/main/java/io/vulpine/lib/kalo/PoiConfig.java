/*
 * Copyright ${YEAR} Elizabeth Harper
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.vulpine.lib.kalo;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * = Poi Configuration
 *
 * Primarily a place holder for planned features.
 *
 * @author mailto:elliefops@gmail.com[Ellie Harper]
 * @version 1
 * @since v0.1.0 - 2017-03-26
 */
class PoiConfig
{
  public CellStyle getHeaderStyle( final Workbook book, final Poi poi )
  {
    final CellStyle style = book.createCellStyle();
    final Font font = book.createFont();

    font.setFontName("Arial");
    font.setBold(true);
    font.setFontHeightInPoints((short) 12);

    style.setAlignment(HorizontalAlignment.CENTER);
    style.setFont(font);

    return style;
  }
}
