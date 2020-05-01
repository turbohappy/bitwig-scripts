package com.purpendiculr.extensions.controllers.presonus.atom;

import java.util.UUID;

import com.bitwig.extension.api.PlatformType;
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList;
import com.bitwig.extension.controller.ControllerExtension;
import com.bitwig.extension.controller.ControllerExtensionDefinition;
import com.bitwig.extension.controller.api.ControllerHost;

public class PresonusAtomExtendedDefinition extends ControllerExtensionDefinition
{
   private static final UUID DRIVER_ID = UUID.fromString("dc199996-44d9-400d-bee8-5593def673aa");

   @Override
   public String getHardwareVendor()
   {
      return "Presonus";
   }

   @Override
   public String getHardwareModel()
   {
      return "ATOM Extended";
   }

   @Override
   public int getNumMidiInPorts()
   {
      return 1;
   }

   @Override
   public int getNumMidiOutPorts()
   {
      return 1;
   }

   @Override
   public void listAutoDetectionMidiPortNames(
      final AutoDetectionMidiPortNamesList list,
      final PlatformType platformType)
   {
      if (platformType == PlatformType.WINDOWS)
      {
         final String[] midiNameList = { "ATOM" };

         list.add(midiNameList, midiNameList);
      }
      else if (platformType == PlatformType.LINUX)
      {
         final String[] midiNameList = { "ATOM MIDI 1" };

         list.add(midiNameList, midiNameList);
      }
      else if (platformType == PlatformType.MAC)
      {
         final String[] midiNameList = { "ATOM" };

         list.add(midiNameList, midiNameList);
      }
   }

   @Override
   public ControllerExtension createInstance(final ControllerHost host)
   {
      return new PresonusAtom(this, host);
   }

   @Override
   public String getName()
   {
      return "ATOM Extended";
   }

   @Override
   public String getHelpFilePath()
   {
      return "Controllers/PreSonus/ATOM.pdf";
   }

   @Override
   public String getAuthor()
   {
      return "Purpendiculr / Bitwig";
   }

   @Override
   public String getVersion()
   {
      return "0.1";
   }

   @Override
   public UUID getId()
   {
      return DRIVER_ID;
   }

   @Override
   public int getRequiredAPIVersion()
   {
      return 10;
   }
}
