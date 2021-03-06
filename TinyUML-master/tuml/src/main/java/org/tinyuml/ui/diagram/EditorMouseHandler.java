/**
 * Copyright 2007 Wei-ju Wu
 *
 * This file is part of TinyUML.
 *
 * TinyUML is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * TinyUML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TinyUML; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.tinyuml.ui.diagram;

/**
 * This interface is implemented by classes that handle DiagramEditor specific
 * mouse events.
 * @author Wei-ju Wu
 * @version 1.0
 */
public interface EditorMouseHandler {

  /**
   * Called when the user issued a mouse click.
   * @param event the mouse event
   */
  void mouseClicked(EditorMouseEvent event);

  /**
   * Called when the user pressed the mouse button.
   * @param event the mouse event
   */
  void mousePressed(EditorMouseEvent event);

  /**
   * Called when the user released the mouse button.
   * @param event the mouse event
   */
  void mouseReleased(EditorMouseEvent event);

  /**
   * Called when the user dragged the mouse.
   * @param event the mouse event
   */
  void mouseDragged(EditorMouseEvent event);

  /**
   * Called when the user moved the mouse.
   * @param event the mouse event
   */
  void mouseMoved(EditorMouseEvent event);
}
