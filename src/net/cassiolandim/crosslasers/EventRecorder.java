/*
 * Copyright (C) 2010 The Android Open Source Project
 *
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
 */
 
 package net.cassiolandim.crosslasers;

public class EventRecorder extends BaseObject {
	private Vector2 mLastDeathPosition = new Vector2();
	
	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
	
	synchronized public void setLastDeathPosition(Vector2 position) {
		mLastDeathPosition.set(position);
	}
	
	synchronized Vector2 getLastDeathPosition() {
		return mLastDeathPosition;
	}

}
