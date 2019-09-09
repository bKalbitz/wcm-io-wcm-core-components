/*
 * #%L
 * wcm.io
 * %%
 * Copyright (C) 2019 wcm.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.wcm.wcm.core.components.impl.models.helpers;

import java.util.Map;

import org.jetbrains.annotations.Nullable;

import com.day.cq.wcm.api.Page;

import io.wcm.handler.link.Link;

/**
 * Wraps a wcm.io Link Handler Link into a core components link.
 */
public class LinkWrapper implements com.adobe.cq.wcm.core.components.models.Link {

  private final Link link;

  /**
   * @param link Link
   */
  public LinkWrapper(Link link) {
    this.link = link;
  }

  @Override
  public boolean isValid() {
    return link.isValid();
  }

  @Override
  public @Nullable String getURL() {
    return link.getUrl();
  }

  @Override
  public @Nullable Map<String, String> getHtmlAttributes() {
    return link.getAnchorAttributes();
  }

  @Override
  public @Nullable Page getTargetPage() {
    return link.getTargetPage();
  }

}
