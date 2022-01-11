/*
 * Copyright 2014-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.release.model;

import lombok.Value;

@Value
public class SimpleIterationVersion implements IterationVersion {

	Version version;
	Iteration iteration;

	/* 
	 * (non-Javadoc)
	 * @see org.springframework.data.release.model.IterationVersion#isBranchVersion()
	 */
	@Override
	public boolean isBranchVersion() {
		return iteration.isServiceIteration();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.springframework.data.release.model.IterationVersion#usesModifierVersionFormat()
	 */
	@Override
	public boolean usesModifierVersionFormat() {
		return false;
	}
}
